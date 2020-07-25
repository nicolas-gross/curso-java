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
		conversao = Integer.parseInt(JOptionPane.showInputDialog("1)Real para D�lar \n2)D�lar para Real \n3)Real para Euro \n4)Euro para real"));
	}
	
	// Real para D�lar
	private double realDolar() {
		return valor / 5.30;
	}
	
	// D�lar para Real
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
		String frase = "A convers�o ser� de : ";
		
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
