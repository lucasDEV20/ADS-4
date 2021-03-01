package com.lucas.Pessoa.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "curso_id")
	private List<Turma> turmas = new ArrayList<>();
	
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
