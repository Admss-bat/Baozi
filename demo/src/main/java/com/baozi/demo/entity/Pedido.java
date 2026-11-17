package com.baozi.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PEDIDO")
public class Pedido extends AbstractEntity<Long>{
	
	

	@Column(name="ID do Cliente", nullable = false)
	private Long clienteId;
	
	@Column(name="ID do Produto", nullable = false)
	private Long produtoId;
	
	@Column(name="Quantidade", nullable = false)
	private Integer quantidade;
	
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
