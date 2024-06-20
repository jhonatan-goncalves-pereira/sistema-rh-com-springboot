package com.AppRH.AppRH.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AppRH.AppRH.models.Vaga;
import com.AppRH.AppRH.repository.CandiadatoRepository;
import com.AppRH.AppRH.repository.VagaRepository;

import jakarta.validation.Valid;

@Controller
public class VagaController {
	
	private VagaRepository vr;
	private CandiadatoRepository cr;
	 
	//determinação de rota que mapeia a função
	//define o endereço do método
	//cadastra vaga
	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.GET)
	public String form() {
		
		return "vaga/formVaga";
	}
	
	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.POST)
	public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
		 if(result.hasErrors()) {
			 attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			 return "redirect:/cadastarVaga";
		 }
		 
		 vr.save(vaga);
		 attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cadastrarVaga";
	}
}
