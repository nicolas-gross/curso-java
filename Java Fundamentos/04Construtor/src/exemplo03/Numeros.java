package exemplo03;

import javax.swing.JOptionPane;

public class Numeros {
	
	// Array
	private int[][] numeros = new int[3][3];
	
	// Construtor
	public Numeros() {
		armazenar();
		
		System.out.println(soma());
		exibir();
	}
	
	// Armazenar n�meros
	private void armazenar() {
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				String mensagem = "Linha: "+(linha+1);
					      mensagem+="\nColuna: "+(coluna+1);
					      
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			}
		}
		
	}
	
	// Somar todos os valores do Array
	private int soma() {
		
		// Soma
		int soma = 0;
		
		// La�o
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				soma += numeros[linha][coluna];
			}
		}
		
		// Retorno
		return soma;
		
	}
	
	
	// Exibir Array
	private void exibir() {
		
		// La�o
		for(int linha = 0; linha < 3; linha++) {
			System.out.println();
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna]+" ");
			}
		}
		
	}


}	










