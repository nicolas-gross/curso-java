package exemplo02;

public class Pessoa {
	
	// Atributos
	private String nome;
	private double peso, altura;
	
	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//C�lculo de m�dia
	private double calculo() {
		return peso/(altura*altura);
	}

	//Situa��o
	private String situacao() {
		double valor = calculo();
		String retorno = "";
		
		if(valor < 17) {
			retorno = "Muito abaixo do peso";
		}else if(valor <= 18.5) {
			retorno = "Abaixo do peso";
		}else if(valor <= 25) {
			retorno = "Peso normal";
		}else {
			retorno = "Acima do peso";
		}
		
		return retorno;
	}
	
	//Resposta
	public String resposta() {
		return "O paciente "+nome+" t�m o IMC de "+calculo()+", e sua situa��o � "+situacao();
	}
	
}








