package exemplo01;

public abstract class Conta {

	// Métodos obrigatórios
	public abstract double emprestimo(double salario);
	public abstract double investimento(double valor, String tipo);

	// Método opcional
	public boolean validaLogin(int agencia, double conta) {
		return true;
	}
	
}
