package exemplo01;

public class Pessoa {

	// Construtor
	public Pessoa() {
		System.out.println("Construtor ok!");
	}
	
	// Construtor com par�metro nome
	public Pessoa(String nome) {
		System.out.println("Boa noite "+nome);
	}
	
	// Construtor com dois par�metros
	public Pessoa(String nome, int idade) {
		System.out.println("Ol� "+nome+", voc� tem "+idade+" anos.");
	}
	
}
