package com.baozi.demo.service;

import com.baozi.demo.entity.Cliente;
import java.util.List;

public interface ClienteService {
	
	void salvar(Cliente cliente);
	void editar(Cliente cliente);
	void excluir(Long id);
	Cliente buscarPorId(Long id);
	List<Cliente> buscaTodos();
	
}
