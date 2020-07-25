package atividade02;

public class Calca extends Roupa{
	
	// Atributo
	public double valor;

	@Override
	public double imposto() {
		return valor < 150 ? valor * 0.05 : valor * 0.10;
	}

	@Override
	public void mensagem() {
		System.out.println("O imposto cobrado sobre a calça é R$"+imposto());
	}

}
