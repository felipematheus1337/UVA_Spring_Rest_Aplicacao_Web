package com.example.aularest.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.aularest.domain.model.Produto;
import com.example.aularest.domain.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produtos/{produtoId}")
	public ResponseEntity<Produto> consultar(@PathVariable Integer produtoId) {
		Optional<Produto> produto =  produtoRepository.findById(produtoId);
		if(produto.isPresent()) {
			return ResponseEntity.ok(produto.get());
		}
		return ResponseEntity.notFound().build();
	
		
	}
	
	
}
