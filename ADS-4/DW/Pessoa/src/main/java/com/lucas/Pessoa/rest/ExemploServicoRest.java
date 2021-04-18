package com.lucas.Pessoa.rest;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franciscocalaca.api.model.PedidoModel;

@RestController
@RequestMapping("/exemploServico")
public class ExemploServicoRest {
	
	//singleton -> garante uma unica instancia do objeto!
	
	private final ExemploServico exemploServico;
	
	public ExemploServicoRest(ExemploServico exemploServico) {
		PedidoModel pedidoModel;
		this.exemploServico = exemploServico;
	}

	
	@GetMapping("/{valor}")
	public String get(ExemploServico exemploServico, @PathVariable("valor") String valor) {
		this.exemploServico.realizarTarefa();
		this.exemploServico.setMemoria(valor);
		return exemploServico.getMemoria();
	}
	
	@GetMapping
	public String get(ExemploServico exemploServico) {
		this.exemploServico.realizarTarefa();
		return this.exemploServico.getMemoria();
	}
	
	@PostMapping
	public void post(ExemploServico exemploServico) {
		exemploServico.realizarTarefa();
	}
	
	@DeleteMapping
	public void delete(ExemploServico exemploServico) {
		exemploServico.realizarTarefa();
	}
	
}

