package com.lucas.backend.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	private String nome;
	
	@ManyToOne
	private Curso curso;
	
	public Turma() {
    }

    public Turma(Long id, String nome, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;

    }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		
		if (nome == null) {
			throw new Exception("Turma inválida.");
		}
		if (nome.isEmpty() || nome.length() < 5) {
			throw new Exception("Turma inválida.");
		}
		
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}