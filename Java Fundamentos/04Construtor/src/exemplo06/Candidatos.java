package exemplo06;

import java.util.Scanner;

public class Candidatos {

	// Contadores de cargos
	private int candidato1, candidato2, candidato3, candidato4;
	
	// Construtor
	public Candidatos() {
		laco();
		resultado();
	}
	
	// Método de repetição
	private void laco() {
		
		//Classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Armazenar o código do cargo
		int codigo;

		// Laço
		do {
			// Perguntas
			System.out.println("1) Candidato1");
			System.out.println("2) Candidato2");
			System.out.println("3) Candidato3");
			System.out.println("4) Candidato4");
			System.out.println("5) Finalizar");
			codigo = ler.nextInt();
			
			//Contabilizar cargo
			contabilizar(codigo);
		}while(codigo != 5);
		
	}
	
	// Contabilizar
	private void contabilizar(int codigo) {
		
		// Escolha
		switch(codigo) {
			case 1: candidato1++;	break;
			case 2: candidato2++; break;
			case 3: candidato3++; break;
			case 4: candidato4++; break;
		}
		
	}
	
	// Exibir quantidade de cargos
	public String exibirVotos() {
		String mensagem = "";
		
		mensagem += "Candidato1: "+candidato1;
		mensagem += "\nCandidato2: "+candidato2;
		mensagem += "\nCandidato3: "+candidato3;
		mensagem += "\nCandidato4: "+candidato4;
		
		return mensagem;
	}
	
	// Exibir quantidade de votos
	private int quantidadeVotos() {
		return candidato1+candidato2+candidato3+candidato4;
	}
	
	// Resultado
	private void resultado() {
		System.out.println("Houve(ram) "+quantidadeVotos()+" voto(s).");
		System.out.println(exibirVotos());
	}
	
}








