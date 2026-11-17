package com.baozi.demo.service;

import java.util.List;
import com.baozi.demo.entity.Produto;

public interface ProdutoService {
	
	void salvar(Produto produto);
	void editar(Produto produto);
	void excluir(Long id);
	Produto buscarPorId(Long id);
	List<Produto> buscaTodos();
	
}
