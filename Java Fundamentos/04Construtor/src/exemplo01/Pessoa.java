package exemplo01;

public class Pessoa {

	// Construtor
	public Pessoa() {
		System.out.println("Construtor ok!");
	}
	
	// Construtor com parâmetro nome
	public Pessoa(String nome) {
		System.out.println("Boa noite "+nome);
	}
	
	// Construtor com dois parâmetros
	public Pessoa(String nome, int idade) {
		System.out.println("Olá "+nome+", você tem "+idade+" anos.");
	}
	
}
