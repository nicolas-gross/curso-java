package exemplo05;

import javax.swing.JOptionPane;

public class Calculo {

	// Atributos
	private double salario;
	private int faltas;
	
	// Construtor
	public Calculo() {
		perguntas();
		resposta();
	}
	
	// Perguntas
	private void perguntas() {
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe as faltas"));
	}
	
	// Vale Transporte
	private double valeTransporte() {
		return salario * 0.06;
	}
	
	// Imposto de Renda
	private double impostoRenda() {
		double desconto = 0;
		
		if(salario <= 1500) {
			desconto = salario * 0.05;
		}else if(salario <= 3000) {
			desconto = salario * 0.10;
		}else {
			desconto = salario * 0.15;
		}
		
		return desconto;
	}
	
	// Vale Alimenta��o
	private double valeAlimentacao() {
		return salario * 0.04;
	}
	
	// Pr�mio Faltas
	private double premioFaltas() {
		double ganho = 0;
		
		if(faltas == 0) {
			ganho = 100;
		}
		
		return ganho;
	}
	
	// Sal�rio L�quido
	private double salarioLiquido() {
		return (salario - (valeTransporte() + valeAlimentacao() + impostoRenda())) + premioFaltas();
	}
	
	// Resposta
	private void resposta() {
		System.out.println("Desconto do Vale Transporte: R$ "+valeTransporte());
		System.out.println("Desconto do Imposto de Renda: R$ "+impostoRenda());
		System.out.println("Desconto do Vale Alimenta��o: R$ "+valeAlimentacao());
		System.out.println("Pr�mio Faltas: R$ "+premioFaltas());
		System.out.println("Sal�rio L�quido: R$ "+salarioLiquido());
	}
	
}
