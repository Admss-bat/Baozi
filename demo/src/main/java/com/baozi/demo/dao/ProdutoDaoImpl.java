package com.baozi.demo.dao;

import org.springframework.stereotype.Repository;

import com.baozi.demo.entity.Produto;

@Repository
public class ProdutoDaoImpl extends AbstractDao<Produto, Long> implements ProdutoDao{

}
