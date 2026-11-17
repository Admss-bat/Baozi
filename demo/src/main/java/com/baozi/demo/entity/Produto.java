package com.baozi.demo.entity;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUTO")

public class Produto extends AbstractEntity<Long>{

	@Column(name="ID do Produto", nullable = false)
	Long id;
	@Column(name="Nome do Produto", nullable = false,  length=50)
	String nome;
	@Column(name="Preço do Produto", nullable = false)
	BigDecimal preco;
	@Column(name="Disponível em Estoque?", nullable = false)
	Boolean estoque;
	
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Boolean getEstoque() {
		return estoque;
	}
	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
	
	
	
	
}
