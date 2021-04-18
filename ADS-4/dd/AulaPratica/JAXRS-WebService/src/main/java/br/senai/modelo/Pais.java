package br.senai.modelo;

public class Pais {

	int id;
	String nomePais;
	long Populacao;

	public Pais() {

	}

	public Pais(int id, String nomePais, long populacao) {
		super();
		this.id = id;
		this.nomePais = nomePais;
		Populacao = populacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public long getPopulacao() {
		return Populacao;
	}

	public void setPopulacao(long populacao) {
		Populacao = populacao;
	}
}
