package atividade02;

public class Vestuario extends Impostos{

	// Construtor
	public Vestuario(String nome, double valor) {
		super(nome, valor);
		
		exibirDados();
	}
	
	// Imposto
	private double impostoVestuario() {
		return valor * 0.05;
	}
	
	// Exibir dados
	private void exibirDados() {
		double valorLiquido = valor - (impostoVestuario()+impostoEstadual()+impostoFederal()+impostoMunicipal());
		
		System.out.println("Imposto Federal: R$"+impostoFederal());
		System.out.println("Imposto Estadual: R$"+impostoEstadual());
		System.out.println("Imposto Municipal: R$"+impostoMunicipal());
		System.out.println("Imposto da Categoria: R$"+impostoVestuario());
		
		System.out.println("Valor do produto sem impostos R$"+valorLiquido);
	}
	
}
