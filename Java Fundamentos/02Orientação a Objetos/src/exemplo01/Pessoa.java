package exemplo01;

import javax.swing.JOptionPane;

//Classe é o molde do seu projeto
public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	private double peso, altura;
	
	//Método de cálculo para IMC
	private double calculo(){
		return peso / (altura * altura);
	}
	
	//Método de situação do IMC
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
	
	//Método de resposta
	private void resposta() {
		System.out.println(nome+" tem o IMC de "+calculo()+" e sua situação é "+situacao());
	}
	
	//Método para obter dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Informe seu nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		resposta();
	}
	
}


