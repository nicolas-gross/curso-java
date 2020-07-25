package ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Primeira nota");
		lblNota1.setBounds(21, 26, 80, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Segunda nota");
		lblNota2.setBounds(21, 62, 80, 14);
		contentPane.add(lblNota2);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(113, 23, 140, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(113, 59, 140, 20);
		contentPane.add(txtNota2);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter notas
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
				// M�dia
				double media = (nota1 + nota2)/2;
				
				// Situa��o
				String situacao = media >= 7 ? "Aprovado" : "Reprovado";
				
				// Mensagem
				JOptionPane.showMessageDialog(null, situacao+" com m�dia "+media);
				
			}
		});
		btnEnviar.setBounds(84, 99, 89, 23);
		contentPane.add(btnEnviar);
	}
}
