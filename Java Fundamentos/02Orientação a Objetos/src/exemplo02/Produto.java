package exemplo02;

import javax.swing.JOptionPane;

//Classe � o molde do seu projeto
public class Produto {
	
	//Atributos
	private String nome;
	private double valor;
	private int quantidade;
	
	//C�lculo
	private double calculo(){
		return valor * quantidade;
	}
	
	//M�todo de resposta
	private void resposta() {
		System.out.println(nome+" ter� o valor final de R$ "+calculo());
	}
	
	//M�todo para obter dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Informe seu nome");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unit�rio"));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		
		resposta();
	}
	
}


