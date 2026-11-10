package com.baozi.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente extends AbstractEntity<Long>{
	
	@Column(name="Nome", nullable = false, unique=true, length=50)
	private String nome;
	
	@Column(name="Cliente Desde", nullable = false, columnDefinition="DATE")
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate clienteDesde;
	
	
	// Getters e Setters --------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getClienteDesde() {
        return clienteDesde;
    }

    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }

    
	
	
	
    
    
}

