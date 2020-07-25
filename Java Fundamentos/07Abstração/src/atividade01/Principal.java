package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Verificar o tipo de veículo
		int tipo = JOptionPane.showConfirmDialog(null, "É um carro?");
		
		// Condicional
		if(tipo == 0) {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			int quantidadePortas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de portas"));
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			String cambio = JOptionPane.showInputDialog("Câmbio");
			Veiculo v = new Carro(valor, quantidadePortas, ano, cambio);
			
		}else {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			int potencia = Integer.parseInt(JOptionPane.showInputDialog("Potência"));
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			
			Veiculo v = new Moto(valor, potencia, ano);			
		}

	}

}
