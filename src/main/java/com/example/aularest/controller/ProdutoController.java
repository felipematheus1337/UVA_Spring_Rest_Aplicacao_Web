package com.example.aularest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	
	
	@GetMapping("/produtos")
	public String listar() {
		return "Meu primeiro REST!";
	}
}
