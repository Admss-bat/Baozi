package com.baozi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layers")
public class ListaController {
	
	@GetMapping("/listar-tudo")
	public String listarPedido() {
		return ("layers/listar-tudo");

	}
	
}
