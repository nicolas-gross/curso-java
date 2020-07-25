package exemplo01;

import javax.swing.JOptionPane;

//Classe � o molde do seu projeto
public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	private double peso, altura;
	
	//M�todo de c�lculo para IMC
	private double calculo(){
		return peso / (altura * altura);
	}
	
	//M�todo de situa��o do IMC
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
	
	//M�todo de resposta
	private void resposta() {
		System.out.println(nome+" tem o IMC de "+calculo()+" e sua situa��o � "+situacao());
	}
	
	//M�todo para obter dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Informe seu nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		resposta();
	}
	
}


