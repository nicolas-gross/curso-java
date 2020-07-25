package exemplo02;

public class PessoaJ extends Conta{
	
	// Atributos
	private String cnpj;
	
	// Construtor
	public PessoaJ(int agencia, int contaCorrente, double saldo, String cnpj) {
		super(agencia, contaCorrente, saldo);
		
		this.cnpj = cnpj;
		
		emprestimo();
	}
	
	// Empr�stimo
	private void emprestimo() {
		System.out.println("Valor do empr�stimo PJ: "+(saldo * 0.1));
	}
	
}




