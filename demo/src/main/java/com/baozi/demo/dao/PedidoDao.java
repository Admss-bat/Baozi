package com.baozi.demo.dao;

import java.util.List;
import com.baozi.demo.entity.Pedido;

public interface PedidoDao {
	
	void save(Pedido pedido);
	void update(Pedido pedido);
	void delete(Long id);
	Pedido findById(Long id);
	List<Pedido> findAll();

}

