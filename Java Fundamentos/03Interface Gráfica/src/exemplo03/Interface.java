package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {

	//Método de formulário
	public void formulario() {
		
		JFrame f = new JFrame();
		f.setSize(530, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JLabel rotuloNumero1= new JLabel("Número 1");
		rotuloNumero1.setBounds(50, 60, 200, 20);
		JLabel rotuloNumero2 = new JLabel("Número 2");
		rotuloNumero2.setBounds(50, 110, 200, 20);
		JLabel rotuloResposta = new JLabel();
		rotuloResposta.setBounds(10, 220, 530, 20);

		JTextField campoNumero1 = new JTextField();
		campoNumero1.setBounds(180, 60, 290, 20);
		JTextField campoNumero2 = new JTextField();
		campoNumero2.setBounds(180, 110, 290, 20);
		
		JButton botao = new JButton("Verificar");
		botao.setBounds(180, 170, 150, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(campoNumero1.getText());
				int numero2 = Integer.parseInt(campoNumero2.getText());
				
				Calculo obj = new Calculo();
				obj.setNumero1(numero1);
				obj.setNumero2(numero2);
				
				rotuloResposta.setText(obj.resposta());
				
			}
		});
		
		f.add(rotuloNumero1);
		f.add(rotuloNumero2);
		f.add(rotuloResposta);
		f.add(campoNumero1);
		f.add(campoNumero2);
		f.add(botao);
		
		f.setVisible(true);
	}
	
}
