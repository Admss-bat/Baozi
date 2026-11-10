package com.baozi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/layers")
public class ProdutoController {
	
	@GetMapping("/cadastrar-produto")
	public String cadastroProduto() {
		return ("layers/cadastrar-produto");
		
	}

	@GetMapping("/listar-produto")
	public String listarProduto() {
		return ("layers/listar-produto");

	}
	

}
