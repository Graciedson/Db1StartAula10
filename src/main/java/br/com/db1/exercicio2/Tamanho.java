package br.com.db1.exercicio2;

public enum Tamanho {

	P("Pequeno"), M("Medio"), G("Grande");
	String descricaoTamanho;

	Tamanho(String tamanho) {
		this.descricaoTamanho = tamanho;
	}

public String getDescricaoTamanho() {

	return descricaoTamanho;
}}