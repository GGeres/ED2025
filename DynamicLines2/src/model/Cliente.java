package model;

public class Cliente {
	String nome;
	int QtdPecas;
	float ValorPecas;
	
	public Cliente(String nome, int QtdPecas, float ValorPecas) {
		this.nome = nome;
		this.QtdPecas = QtdPecas;
		this.ValorPecas = ValorPecas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPecas(String nome) {
		this.QtdPecas = QtdPecas;
	}
	
	public int getPecas() {
		return this.QtdPecas;
	}
	
	public void setVPecas(String nome) {
		this.ValorPecas = ValorPecas;
	}
	
	public float getVPecas() {
		return this.ValorPecas;
	}
	
	public float calcValorTot() {
		return QtdPecas * ValorPecas;
	}
}
