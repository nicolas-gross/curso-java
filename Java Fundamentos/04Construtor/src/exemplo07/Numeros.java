package exemplo07;

import javax.swing.JOptionPane;

public class Numeros {
	
	// Array
	private int[][] numeros = new int[5][5];
	
	// Construtor
	public Numeros() {
		perguntas();
		respostas();
	}
	
	// Armazenar números
	private void perguntas() {
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				String mensagem = "Linha: "+(linha+1);
					      mensagem+="\nColuna: "+(coluna+1);
					      
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			}
		}
		
	}
	
	// Soma da diagonal principal
	private int diagonalPrincipal() {
		return numeros[0][0] + numeros[1][1] + numeros[2][2] + numeros[3][3] + numeros[4][4];
	}
	
	// Soma da diagonal secundária
	private int diagonalSecundaria() {
		return numeros[0][4] + numeros[1][3] + numeros[2][2] + numeros[3][1] + numeros[4][0];
	}
	
	// Soma da quarta linha
	private int quartaLinha() {
		return numeros[3][0] + numeros[3][1] + numeros[3][2] + numeros[3][3] + numeros[3][4];
	}
	
	// Soma da segunda coluna
	private int segundaColuna() {
		return numeros[0][1] + numeros[1][1] + numeros[2][1] + numeros[3][1] + numeros[4][1];
	}
	
	// Somar todos os valores do Array
	private int SomaMatriz() {
		
		// Soma
		int soma = 0;
		
		// Laço
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				soma += numeros[linha][coluna];
			}
		}
		
		// Retorno
		return soma;
		
	}
	
	
	// Exibir Array
	private String exibirMatriz() {
		
		// Matriz
		String matriz = "";
		
		// Laço
		for(int linha = 0; linha < 5; linha++) {
			matriz += "\n";
			for(int coluna = 0; coluna < 5; coluna++) {
				matriz += numeros[linha][coluna]+" ";
			}
		}
		
		// Retorno
		return matriz;
		
	}
	
	// Resposta
	private void respostas() {
		System.out.println("Soma diagonal principal é "+diagonalPrincipal());
		System.out.println("Soma diagonal secundária é "+diagonalSecundaria());
		System.out.println("Soma da quarta linha "+quartaLinha());
		System.out.println("Soma da segunda coluna"+segundaColuna());
		System.out.println("A soma da matriz é "+SomaMatriz());
		System.out.println("A matriz é constituída por:"+exibirMatriz());
		
	}


}	










