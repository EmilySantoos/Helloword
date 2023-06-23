package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bsmsGeneration")
public class BsmsGeneration {
	
	
	@GetMapping
	public String BsmsGenerati(){
		return "Responsabilidade Pessoal\r\n"
				+ "\nMentalidade de Crescimento\r\n"
				+ "\nOrientação ao Futuro\r\n"
				+ "\nPersistência\r\n"
				+ "\nComunicação\r\n"
				+ "\nOrientação aos Detalhes\r\n"
				+ "\nTrabalho em equipe\r\n"
				+ "\nProatividade";
	}
}


