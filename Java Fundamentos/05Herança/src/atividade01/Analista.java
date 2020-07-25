package atividade01;

public class Analista extends Impostos{

	// Construtor
	public Analista(double salario) {
		super(salario);
		
		relatorio();
	}

	// Imposto de renda
	private double impostoRenda() {
		return salario * 0.06;
	}
	
	// Relat�rio
	private void relatorio() {
		double salarioLiquido = salario - (valeTransporte()+valeAlimentacao()+impostoRenda());
		
		System.out.println("Vale Transporte: "+valeTransporte());
		System.out.println("Vale Alimenta��o: "+valeAlimentacao());
		System.out.println("Imposto de Renda: "+impostoRenda());
		System.out.println("Sal�rio l�quido: R$ "+salarioLiquido);
	}
	
}
