package atividade02;

public class Impostos {

	// Atributos
	protected String nome;
	protected double valor;
	
	// Construtor
	public Impostos(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	// Imposto Federal
	protected double impostoFederal() {
		return valor * 0.05;
	}
	
	// Imposto Estadual
	protected double impostoEstadual() {
		return valor * 0.03;
	}
	
	// Imposto Municipal
	protected double impostoMunicipal() {
		return valor * 0.02;
	}
	
}
