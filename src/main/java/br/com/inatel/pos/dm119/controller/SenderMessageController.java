package br.com.inatel.pos.dm119.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.inatel.pos.dm119.service.SenderMessage;

@Controller
public class SenderMessageController {
	
	@Autowired
	SenderMessage sm;
	
	@RequestMapping("/")
	public String getFormulario() {
		return "formulario.jsp";
	}
	
	@RequestMapping("goMessage")
	public String enviaMsg(String destinatario, String msg) {
		sm.sendMessage(destinatario, msg);
		return "redirect:/";
	}

}
