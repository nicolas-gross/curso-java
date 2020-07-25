package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Loop
		int loop;
		
		// Laço
		do {
			int cargo = Integer.parseInt(JOptionPane.showInputDialog("1)Desenvolvedor \n2)Analista \n3)Gerente"));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
			
			switch(cargo) {
				case 1:
					Desenvolvedor d = new Desenvolvedor(salario);
				break;
				
				case 2:
					Analista a = new Analista(salario);
				break;
				
				case 3:
					Gerente g = new Gerente(salario);
				break;
			}
			
			loop = JOptionPane.showConfirmDialog(null, "Deseja conitinuar?");
		}while(loop == 0);

	}

}




