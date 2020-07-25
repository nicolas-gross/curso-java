package exemplo02;

public class PessoaF extends Conta{
	
	// Atributos
	private String cpf;
	
	// Construtor
	public PessoaF(int agencia, int contaCorrente, double saldo, String cpf) {
		super(agencia, contaCorrente, saldo);
		
		this.cpf = cpf;
		
		emprestimo();
	}
	
	// Empréstimo
	private void emprestimo() {
		System.out.println("Valor do empréstimo PF: "+(saldo * 0.05));
	}
}
