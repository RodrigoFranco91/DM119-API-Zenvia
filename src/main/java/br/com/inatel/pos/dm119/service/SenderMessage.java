package br.com.inatel.pos.dm119.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.zenvia.api.sdk.client.Channel;
import com.zenvia.api.sdk.client.errors.ErrorResponse;
import com.zenvia.api.sdk.client.exceptions.UnsuccessfulRequestException;
import com.zenvia.api.sdk.client.spring.Client;
import com.zenvia.api.sdk.contents.TextContent;
import com.zenvia.api.sdk.messages.Message;

@Service
public class SenderMessage {
	
	@Value("${api.zenvia.token}")
	String token;
	
	public void sendMessage(String destinatario, String msg) {
		Client client = new Client(token);
		Channel sms = client.getChannel("sms");
		TextContent content = new TextContent(msg);
		try {
		  Message response = sms.sendMessage("dull-slope", destinatario, content);
		} catch(UnsuccessfulRequestException exception) {
		  ErrorResponse response = exception.body;
		}
	}
}
