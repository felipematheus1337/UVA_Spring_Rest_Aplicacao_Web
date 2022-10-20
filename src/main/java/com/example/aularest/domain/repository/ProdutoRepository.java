package com.example.aularest.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aularest.domain.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

	List<Produto> findByNome(String nome);
}
