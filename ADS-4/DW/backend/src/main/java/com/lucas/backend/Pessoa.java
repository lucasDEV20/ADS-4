package com.lucas.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //inidca qeu o objeto da classe deve ser manipulada pe,o jpa
public class Pessoa {
	
	@Id  
	//informa que este campo é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define a estratégia de geracao de ID

      
	private long id;
	private String nome;
	private String sexo;
	private String CorDeclarada;
	private int idade;
	private int peso;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCorDeclarada() {
		return CorDeclarada;
	}
	public void setCorDeclarada(String corDeclarada) {
		CorDeclarada = corDeclarada;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
	
	
	
		
}
