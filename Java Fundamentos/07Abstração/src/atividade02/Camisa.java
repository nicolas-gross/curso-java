package atividade02;

public class Camisa extends Roupa{
	
	// Atributo
	public double valor;

	@Override
	public double imposto() {
		return valor < 100 ? valor * 0.07 : valor * 0.12;
	}

	@Override
	public void mensagem() {
		System.out.println("O imposto cobrado sobre a camisa é R$"+imposto());
	}

}
