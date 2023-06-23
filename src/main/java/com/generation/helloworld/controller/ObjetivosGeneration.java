package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Objetivos")
public class ObjetivosGeneration {

	@GetMapping
	public String ObjetivosGen(){
		return "Foi dado inicío ao segundo bloco, onde começamos dar inicío ao nosso blogPessoal,onde usaremos no nosso projeto Integrador.\r\n"
				+ " Estamos aprendendo a usar a ferramenta SprintBoot,com ajudar de nossos instrutores.";
	}
}
	


