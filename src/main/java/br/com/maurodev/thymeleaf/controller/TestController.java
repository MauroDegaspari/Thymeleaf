package br.com.maurodev.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maurodev.thymeleaf.model.Pessoa;

@Controller
public class TestController {

	
	@GetMapping(value="/hello")
	public ModelAndView Ola() {
		ModelAndView mv = new ModelAndView("index"); // nome do arquivo HTML a ser renderizado/exibido
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		mv.addObject("nome", pessoa.getNome());
		return mv;
	}
}
