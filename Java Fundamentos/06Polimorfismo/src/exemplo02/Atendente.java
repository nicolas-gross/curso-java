package exemplo02;

public class Atendente extends Tributos{

	// Construtor
	public Atendente(double salario) {
		System.out.println("Cargo Atendente");
		System.out.println("Vale Transporte R$"+vt(salario));
		System.out.println("Vale Alimenta��o R$"+va(salario));
	}
	
	// Sobrepor c�lculo de Vale Alimenta��o
	@Override
	public double va(double salario) {
		return salario * 0.05;
	}
	
}
