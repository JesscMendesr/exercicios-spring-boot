package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/bsm")
	public String hello() {
		return "Orientação ao futuro\r\n"
				+ "Persistência\r\n"
				+ "Responsabilidade pessoal\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação";
	}
	
	@GetMapping("/objetivos-da-semana")
	public String objetivosDaSemana() {
		return "Aprender mais sobre criação de API REST com Spring Boot";
		
	}

}



