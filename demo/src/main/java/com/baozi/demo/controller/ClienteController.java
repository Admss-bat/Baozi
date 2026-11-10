package com.baozi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baozi.demo.entity.Cliente;
import com.baozi.demo.service.ClienteService;

@Controller
@RequestMapping("/layers")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/cadastrar-cliente")
	public String cadastroCliente(Cliente cliente) {
		return ("layers/cadastrar-cliente");
		
	}
	
	
	//CADASTRO DE CLIENTES ------------------------------------------------------------------------------
	
	@PostMapping("/cadastrar-cliente/salvar")
	public String salvarCliente(Cliente cliente) {
		
		service.salvar(cliente);
		return ("layers/listar-cliente"); 
		
	}
	
	//LISTAR CLIENTES CADASTRADOS ---------------------------------------------------------------------
	
	@GetMapping("/listar-clientes")
	public String listaCliente(ModelMap model) {
		
		model.addAttribute("cliente", service.buscaTodos());
		return ("layers/listar-cliente");

	}
	
	
	@PostMapping("/cliente/editar")
	public String editar(Cliente cliente) {
		
		service.editar(cliente);
		return ("layers/listar-cliente");
		
	}
	
	@GetMapping("/cliente/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
		service.excluir(id);
		return listaCliente(model);
		
	}
	
	@GetMapping("/cliente/editar/{id}")
	public String editar(@PathVariable("id") Long id, ModelMap model) {
		
		model.addAttribute("cliente", service.buscarPorId(id));
		return ("layers/cadastrar-cliente");
	}
	
}
