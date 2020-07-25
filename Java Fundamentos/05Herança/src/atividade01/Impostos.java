package atividade01;

public class Impostos {

	// Atributo
	protected double salario;
	
	// Construtor
	public Impostos(double salario) {
		this.salario = salario;
	}
	
	// Vale transporte
	protected double valeTransporte() {
		return salario * 0.06;
	}
	
	// Vale refeição
	protected double valeAlimentacao() {
		return salario * 0.05;
	}
	
}
