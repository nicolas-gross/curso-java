package atividade02;

public class Eletronicos extends Impostos{

	// Construtor
	public Eletronicos(String nome, double valor) {
		super(nome, valor);
		
		exibirDados();
	}
	
	// Imposto
	private double impostoEletronicos() {
		return valor * 0.2;
	}
	
	// Exibir dados
	private void exibirDados() {
		double valorLiquido = valor - (impostoEletronicos()+impostoEstadual()+impostoFederal()+impostoMunicipal());
		
		System.out.println("Imposto Federal: R$"+impostoFederal());
		System.out.println("Imposto Estadual: R$"+impostoEstadual());
		System.out.println("Imposto Municipal: R$"+impostoMunicipal());
		System.out.println("Imposto da Categoria: R$"+impostoEletronicos());
		
		System.out.println("Valor do produto sem impostos R$"+valorLiquido);
	}
}
