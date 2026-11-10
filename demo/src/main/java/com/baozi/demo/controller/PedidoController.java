package com.baozi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layers")
public class PedidoController {
	
	@GetMapping("/cadastrar-pedido")
	public String cadastroPedido() {
		return ("layers/cadastrar-pedido");
		
	}

	@GetMapping("/listar-pedido")
	public String listarPedido() {
		return ("layers/listar-pedido");

	}

}
