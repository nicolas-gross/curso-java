package exemplo02;

public class Desenvolvedor extends Tributos{
	
	// Construtor
	public Desenvolvedor(double salario) {
		System.out.println("Cargo Desenvolvedor");
		System.out.println("Vale Transporte R$"+vt(salario));
		System.out.println("Vale Alimenta��o R$"+va(salario));
	}

}
