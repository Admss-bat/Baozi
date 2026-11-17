package com.baozi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baozi.demo.entity.Produto;
import com.baozi.demo.service.ProdutoService;

@Controller
@RequestMapping("/layers")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/cadastrar-produto")
	public String cadastroProduto(Produto produto) {
		return ("layers/cadastrar-produto");
		
	}
	
	
	//CADASTRO DE PRODUTOS ------------------------------------------------------------------------------
	
	@PostMapping("/cadastrar-produto/salvar")
	public String salvarProduto(Produto produto) {
		
		service.salvar(produto);
		return "redirect:/layers/listar-produtos"; 
		
	}
	
	//LISTAS DE PRODUTOS ---------------------------------------------------------------------
	
	@GetMapping("/listar-produtos")
	public String listaProduto(ModelMap model) {
		
		model.addAttribute("produto", service.buscaTodos());
		return ("layers/listar-produto");

	}
	
	
	@PostMapping("/cadastrar-produto/editar")
	public String editar(Produto produto) {
		
		service.editar(produto);
		return ("redirect:/layers/listar-produtos"); 
		
	}
	
	@GetMapping("/produto/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
		service.excluir(id);
		return listaProduto(model);
		
	}
	
	@GetMapping("/cadastrar-produto/editar/{id}")
	public String editar(@PathVariable("id") Long id, ModelMap model) {
		
		model.addAttribute("produto", service.buscarPorId(id));
		return ("layers/cadastrar-produto");
	}
}
