package atividade02;

public class Alimenticio extends Impostos{

	// Construtor
	public Alimenticio(String nome, double valor) {
		super(nome, valor);
		
		exibirDados();
	}
	
	// Imposto
	private double impostoAlimenticio() {
		return valor * 0.07;
	}
	
	// Exibir dados
	private void exibirDados() {
		double valorLiquido = valor - (impostoAlimenticio()+impostoEstadual()+impostoFederal()+impostoMunicipal());
		
		System.out.println("Imposto Federal: R$"+impostoFederal());
		System.out.println("Imposto Estadual: R$"+impostoEstadual());
		System.out.println("Imposto Municipal: R$"+impostoMunicipal());
		System.out.println("Imposto da Categoria: R$"+impostoAlimenticio());

		System.out.println("Valor do produto sem impostos R$"+valorLiquido);
	}
	
}
