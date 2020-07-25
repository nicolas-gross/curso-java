package exemplo01;

public class Aluno {
	
	// Atributos
	private String nome;
	private double nota1, nota2;
	
	// Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	//C�lculo de m�dia
	private double calculo() {
		return (nota1+nota2)/2;
	}
	
	//Situa��o
	private String situacao() {
		return calculo() >= 7 ? "Aprovado" : "Reprovado";
	}
	
	//Resposta
	public String resposta() {
		return "O aluno "+nome+" obteve m�dia "+calculo()+", e sua situa��o � "+situacao();
	}
	
}








