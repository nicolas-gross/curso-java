package exemplo03;

public class Calculo {
	
	// Atributos
	private int numero1, numero2;
	
	// Get e Set
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	
	//Validar n�meros
	private String validarNumeros() {
		return numero1 == numero2 ? "s�o iguais" : "s�o diferentes";
	}
	
	//Resposta
	public String resposta() {
		return "O n�mero "+numero1+" e o n�mero "+numero2+" "+validarNumeros();
	}
	
}








