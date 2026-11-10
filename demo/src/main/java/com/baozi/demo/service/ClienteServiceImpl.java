package com.baozi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baozi.demo.dao.ClienteDao;
import com.baozi.demo.entity.Cliente;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=false)
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDao dao;

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		dao.save(cliente);
		

	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		dao.update(cliente);

	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly=true)
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> buscaTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
