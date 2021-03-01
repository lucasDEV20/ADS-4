package com.lucas.Pessoa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.Pessoa.dao.TurmaDao;
import com.lucas.Pessoa.entidade.Turma;



@RestController
@RequestMapping("/turma")
public class TurmaRest {

	@Autowired
	private TurmaDao turmaDao;
	
	@GetMapping
	public List<Turma> get() {
		return turmaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Turma turma) {
		turmaDao.save(turma);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		turmaDao.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody Turma turma) {
		
	}
}
