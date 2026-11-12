package com.baozi.demo.service;

import java.util.List;
import com.baozi.demo.entity.Pedido;


public interface PedidoService {
		
	void salvar(Pedido pedido);
	void editar(Pedido pedido);
	void excluir(Long id);
	Pedido buscarPorId(Long id);
	List<Pedido> buscaTodos();
	
}
