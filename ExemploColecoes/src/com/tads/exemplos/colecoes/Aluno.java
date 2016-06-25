package com.tads.exemplos.colecoes;

//fonte: http://www.algaworks.com/aulas/104/collections-framework/

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
