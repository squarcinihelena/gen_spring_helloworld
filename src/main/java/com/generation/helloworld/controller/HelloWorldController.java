package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Anotação que indica que essa classe é um controlador REST
@RequestMapping("/hello") //td requisicao q vier pra hello, é 
							//essa controladora q vai decidir oq fazer com ela

public class HelloWorldController {
	
	
    @GetMapping("/hello")  // Anotação que mapeia a URL "/hello" para esse método
	public String hello() {
		return "<b>Hello World!</b>";
	}
    
    @GetMapping("/turma82")
    public String turmaJava82() {
    	return "<b>A Turma Java 82 é TOP!</b>";
    }
    
	
}
