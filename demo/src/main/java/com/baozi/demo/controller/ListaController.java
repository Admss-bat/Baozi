package com.baozi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baozi.demo.service.ClienteService;
import com.baozi.demo.service.PedidoService;
import com.baozi.demo.service.ProdutoService;

@Controller
@RequestMapping("/layers")
public class ListaController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/listar-tudo")
	public String listarTudo(ModelMap model) {
		model.addAttribute("clientes", clienteService.buscaTodos());
		model.addAttribute("produtos", produtoService.buscaTodos());
		model.addAttribute("pedidos", pedidoService.buscaTodos());

		return "layers/listar-tudo";
	}
}