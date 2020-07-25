package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Verificar loop
		int loop;
		
		// Laço
		do {
			// Tipo de conta
			int tipo = JOptionPane.showConfirmDialog(null, "É pessoa física?");
			
			// Dados em comum
			int agencia = Integer.parseInt(JOptionPane.showInputDialog("Agência"));
			int contaCorrente = Integer.parseInt(JOptionPane.showInputDialog("CC"));
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
			
			// Condicional
			if(tipo == 0) {
				String cpf = JOptionPane.showInputDialog("CPF");
				PessoaF pf = new PessoaF(agencia, contaCorrente, saldo, cpf);
			}else {
				String cnpj = JOptionPane.showInputDialog("CNPJ");
				PessoaJ pj = new PessoaJ(agencia, contaCorrente, saldo, cnpj);
			}
			
			// Verificar de deseja cadastrar mais uma conta
			loop = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(loop == 0);

	}
	
}








