package com.poo.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);

		System.out.println("==========");
		System.out.println("Página inicial em: http://localhost:8080");
		System.out.println("Cadastro de livros em: http://localhost:8080/biblioteca/cadastro_de_livros");
		System.out.println("==========");
	}
}