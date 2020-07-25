package calculadora;

public class Calculadora implements Padrao{
	
	// Atributos
	private int n1, n2;
	
	// Construtor
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// M�todos
	@Override
	public int somar(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int subtrair(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int multiplicar(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public double dividir(int n1, int n2) {
		return n1/n2;
	}

	
	
}
