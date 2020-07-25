package exemplo02;

import javax.swing.JOptionPane;

//Classe é o molde do seu projeto
public class Produto {
	
	//Atributos
	private String nome;
	private double valor;
	private int quantidade;
	
	//Cálculo
	private double calculo(){
		return valor * quantidade;
	}
	
	//Método de resposta
	private void resposta() {
		System.out.println(nome+" terá o valor final de R$ "+calculo());
	}
	
	//Método para obter dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Informe seu nome");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário"));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		
		resposta();
	}
	
}


