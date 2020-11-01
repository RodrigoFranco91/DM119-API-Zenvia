package br.com.inatel.pos.dm119;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zenvia.api.sdk.client.Channel;
import com.zenvia.api.sdk.client.errors.ErrorResponse;
import com.zenvia.api.sdk.client.exceptions.UnsuccessfulRequestException;
import com.zenvia.api.sdk.client.spring.Client;
import com.zenvia.api.sdk.contents.TextContent;
import com.zenvia.api.sdk.messages.Message;

@SpringBootApplication
public class Dm119Application {

	public static void main(String[] args) {
		SpringApplication.run(Dm119Application.class, args);
	}
}
