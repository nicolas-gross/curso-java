package exemplo02;

import java.util.Scanner;

public class Cargo {

	// Contadores de cargos
	private int desenvolvedor, analista, gerente, estagiario, documentador;
	
	// Construtor
	public Cargo() {
		repeticao();
		exibir();
	}
	
	// M�todo de repeti��o
	private void repeticao() {
		
		//Classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Armazenar o c�digo do cargo
		int codigo;

		// La�o
		do {
			// Perguntas
			System.out.println("1) Desenvolvedor");
			System.out.println("2) Analista");
			System.out.println("3) Gerente");
			System.out.println("4) Estagi�rio");
			System.out.println("5) Documentador");
			System.out.println("6) Finalizar");
			codigo = ler.nextInt();
			
			//Contabilizar cargo
			contabilizar(codigo);
		}while(codigo != 6);
		
	}
	
	// Contabilizar
	private void contabilizar(int codigo) {
		
		// Escolha
		switch(codigo) {
			case 1: desenvolvedor++; break;
			case 2: analista++; 			break;
			case 3: gerente++; 			break;
			case 4: estagiario++; 		break;
			case 5: documentador++; break;
		}
		
	}
	
	// Exibir quantidade de cargos
	public void exibir() {
		System.out.println("Desenvolvedor: "+desenvolvedor);
		System.out.println("Analista: "+analista);
		System.out.println("Gerente: "+gerente);
		System.out.println("Estagi�rio: "+estagiario);
		System.out.println("Documentador: "+documentador);
	}
	
}








