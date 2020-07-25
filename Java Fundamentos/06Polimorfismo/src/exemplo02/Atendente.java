package exemplo02;

public class Atendente extends Tributos{

	// Construtor
	public Atendente(double salario) {
		System.out.println("Cargo Atendente");
		System.out.println("Vale Transporte R$"+vt(salario));
		System.out.println("Vale Alimentação R$"+va(salario));
	}
	
	// Sobrepor cálculo de Vale Alimentação
	@Override
	public double va(double salario) {
		return salario * 0.05;
	}
	
}
