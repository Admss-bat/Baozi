package com.baozi.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PEDIDO")
public class Pedido extends AbstractEntity<Long>{
	
	@Column(name="ID do Cliente", nullable = false)
	Long clienteId;
	
	@Column(name="ID do Pedido", nullable = false, unique=true)
	Long produtoId;
	
	@Column(name="Quantidade", nullable = false, unique=true, length=50)
	Integer quantidade;
	
	public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
    
    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
