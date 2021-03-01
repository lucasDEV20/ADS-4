package com.lucas.Pessoa.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	private String nome;
	
	@ManyToOne
	private Turma turma;
	
	@OneToMany
	@JoinColumn(name = "disciplina_id")
	private List<MatriculaDisciplinaPessoa> matriculasDisciplinaPessoa = new ArrayList<>();
	
    public Disciplina() {
    }

    public Disciplina(Long id, String nome, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
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
			throw new Exception("Disciplina inválida.");
		}
		if (nome.isEmpty() || nome.length() < 5) {
			throw new Exception("Disciplina inválida.");
		}
		
		this.nome = nome;
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}