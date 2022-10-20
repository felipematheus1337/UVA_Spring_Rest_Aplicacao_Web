package com.example.aularest.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "categoria")
	private Integer categoria;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "loja_fisica")
	private String temLojaFisica;
	
	@Column(name = "preco")
	private Float preco;
	
	@Column(name = "data_validade")
	private String dataValidade;
	
	@Column(name = "descricao")
	private String descricao;
	
	
	public Produto(Integer codigo, Integer categoria, Integer quantidade, String nome, String temLojaFisica,
			Float preco, String dataValidade, String descricao) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.nome = nome;
		this.temLojaFisica = temLojaFisica;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}

	public Produto() {
		super();
	}

	
	public Produto(Integer categoria, Integer quantidade, String nome, String temLojaFisica, Float preco,
			String dataValidade, String descricao) {
		super();
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.nome = nome;
		this.temLojaFisica = temLojaFisica;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTemLojaFisica() {
		return temLojaFisica;
	}

	public void setTemLojaFisica(String temLojaFisica) {
		this.temLojaFisica = temLojaFisica;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", categoria=" + categoria + ", quantidade=" + quantidade + ", nome="
				+ nome + ", temLojaFisica=" + temLojaFisica + ", preco=" + preco + ", dataValidade=" + dataValidade
				+ ", descricao=" + descricao + "]";
	}
	
	
	
	
	
	
	
}


