package atividade01;

public class Gerente extends Impostos{

	// Construtor
	public Gerente(double salario) {
		super(salario);
		
		relatorio();
	}
	
	// Imposto de renda
	private double impostoRenda() {
		return salario * 0.1;
	}
	
	// Relatório
	private void relatorio() {
		double salarioLiquido = salario - (valeTransporte()+valeAlimentacao()+impostoRenda());
		
		System.out.println("Vale Transporte: "+valeTransporte());
		System.out.println("Vale Alimentação: "+valeAlimentacao());
		System.out.println("Imposto de Renda: "+impostoRenda());
		System.out.println("Salário líquido: R$ "+salarioLiquido);
	}
	
}
