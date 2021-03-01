package com.lucas.backend.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nome;
	
    public Curso() {
    }

    public Curso(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		
		if (nome == null) {
			throw new Exception("Curso inválido.");
		}
		if (nome.isEmpty() || nome.length() < 5) {
			throw new Exception("Curso inválido.");
		}
		
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}