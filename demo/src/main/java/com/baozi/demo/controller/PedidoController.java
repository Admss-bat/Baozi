package com.baozi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baozi.demo.entity.Pedido;
import com.baozi.demo.service.PedidoService;

@Controller
@RequestMapping("/layers")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping("/cadastrar-pedido")
	public String cadastroPedido(Pedido pedido) {
		return ("layers/cadastrar-pedido");
		
	}
	
	
	//CADASTRO DE PEDIDOS ------------------------------------------------------------------------------
	
	@PostMapping("/cadastrar-pedido/salvar")
	public String salvarPedido(Pedido pedido) {
		
		service.salvar(pedido);
		return "redirect:/layers/listar-pedidos"; 
		
	}
	
	//LISTAS DE PEDIDOS ---------------------------------------------------------------------
	
	@GetMapping("/listar-pedidos")
	public String listaPedido(ModelMap model) {
		
		model.addAttribute("pedido", service.buscaTodos());
		return ("layers/listar-pedido");

	}
	
	
	@PostMapping("/cadastrar-pedido/editar")
	public String editar(Pedido pedido) {
		
		service.editar(pedido);
		return ("redirect:/layers/listar-pedidos"); 
		
	}
	
	@GetMapping("/pedido/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
		service.excluir(id);
		return listaPedido(model);
		
	}
	
	@GetMapping("/cadastrar-pedido/editar/{id}")
	public String editar(@PathVariable("id") Long id, ModelMap model) {
		
		model.addAttribute("pedido", service.buscarPorId(id));
		return ("layers/cadastrar-pedido");
	}
}
