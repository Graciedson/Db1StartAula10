package br.com.db1.exercicio1;

public class Celular {

	private String operadora;

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getDuaChip() {
		return duaChip;
	}

	public void setDuaChip(Boolean duaChip) {
		this.duaChip = duaChip;
	}

	public Double getTamanhoDaTela() {
		return tamanhoDaTela;
	}

	public void setTamanhoDaTela(Double tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}

	private String marca;
	private Boolean duaChip;
	private Double tamanhoDaTela;

	public Boolean temSinal() {
		return true;
	}

}
