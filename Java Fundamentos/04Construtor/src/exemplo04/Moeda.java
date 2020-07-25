package exemplo04;

import javax.swing.JOptionPane;

public class Moeda {
	
	// Atributos
	private double valor;
	private int conversao;
	
	// Construtor
	public Moeda() {
		perguntas();
		resultado();
	}
	
	// Perguntas
	private void perguntas() {
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja converter"));
		conversao = Integer.parseInt(JOptionPane.showInputDialog("1)Real para Dólar \n2)Dólar para Real \n3)Real para Euro \n4)Euro para real"));
	}
	
	// Real para Dólar
	private double realDolar() {
		return valor / 5.30;
	}
	
	// Dólar para Real
	private double dolarReal() {
		return valor * 5.30;
	}
	
	// Real para Euro
	private double realEuro() {
		return valor / 6;
	}
	
	// Euro para Real
	private double euroReal() {
		return valor * 6;
	}
	
	// Resultado
	private void resultado() {
		String frase = "A conversão será de : ";
		
		switch (conversao) {
			case 1: 
				frase+=realDolar(); 
			break;
			
			case 2: 
				frase+=dolarReal(); 
			break;
			
			case 3: 
				frase+=realEuro(); 
			break;
			
			case 4: 
				frase+=euroReal(); 
			break;
		}
		
		JOptionPane.showMessageDialog(null, frase);
	}

}
