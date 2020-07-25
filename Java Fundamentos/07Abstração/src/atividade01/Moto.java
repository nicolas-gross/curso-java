package atividade01;

public class Moto extends Veiculo{

	// Atributo
	private int potencia, ano;
	
	// Construtor
	public Moto(double valor, int potencia, int ano) {
		this.valor = valor;
		this.potencia = potencia;
		this.ano = ano;
		
		retorno();
	}
	
	@Override
	public void retorno() {
		System.out.println("IPVA R$"+ipva(ano));		
		System.out.println("Pot�ncia R$"+potencia());
	}	
	
	// Pot�ncia
	private double potencia() {
		double valor = this.valor * 0.25;
		
		if(potencia < 30) {
			valor = this.valor * 0.15;
		}else if(potencia < 70){
			valor = this.valor * 0.20;
		}
		
		return valor;
	}

}
