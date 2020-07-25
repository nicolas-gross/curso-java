package exemplo01;

public abstract class Conta {

	// M�todos obrigat�rios
	public abstract double emprestimo(double salario);
	public abstract double investimento(double valor, String tipo);

	// M�todo opcional
	public boolean validaLogin(int agencia, double conta) {
		return true;
	}
	
}
