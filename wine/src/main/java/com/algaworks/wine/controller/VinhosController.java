package com.algaworks.wine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.Vinhos;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {
	
	@Autowired
	private Vinhos vinhos;

	@RequestMapping("/novo")
	public String novo() {
		
		return "/vinho/CadastroVinho";
	}
	
	@RequestMapping
	public ModelAndView pesquisa() {
		List<Vinho> todosVinhos = vinhos.findAll();
		ModelAndView mv = new ModelAndView("/vinho/ListagemVinho");
		mv.addObject("vinhos",todosVinhos);		
		return mv;
	}
	
}








