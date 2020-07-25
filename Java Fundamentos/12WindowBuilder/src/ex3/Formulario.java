package ex3;

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
	private JTextField txtL1;
	private JTextField txtL2;
	private JTextField txtL3;
	private JTextField txtL4;

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
		setBounds(100, 100, 279, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Lado Superior");
		lblNota1.setBounds(21, 26, 80, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Lado Direito");
		lblNota2.setBounds(21, 62, 80, 14);
		contentPane.add(lblNota2);
		
		txtL1 = new JTextField();
		txtL1.setBounds(113, 23, 140, 20);
		contentPane.add(txtL1);
		txtL1.setColumns(10);
		
		txtL2 = new JTextField();
		txtL2.setColumns(10);
		txtL2.setBounds(113, 59, 140, 20);
		contentPane.add(txtL2);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				int l1 = Integer.parseInt(txtL1.getText());
				int l2 = Integer.parseInt(txtL2.getText());
				int l3 = Integer.parseInt(txtL3.getText());
				int l4 = Integer.parseInt(txtL4.getText());
								
				// Condicional
				if((l1 == l2) && (l2==l3) && (l3==l4)) {					
					JOptionPane.showMessageDialog(null, "� um quadrado");
				}else {
					JOptionPane.showMessageDialog(null, "N�o � um quadrado");
				}
				
			}
		});
		btnEnviar.setBounds(85, 183, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblLadoInferior = new JLabel("Lado Inferior");
		lblLadoInferior.setBounds(21, 99, 80, 14);
		contentPane.add(lblLadoInferior);
		
		txtL3 = new JTextField();
		txtL3.setColumns(10);
		txtL3.setBounds(113, 96, 140, 20);
		contentPane.add(txtL3);
		
		txtL4 = new JTextField();
		txtL4.setColumns(10);
		txtL4.setBounds(113, 132, 140, 20);
		contentPane.add(txtL4);
		
		JLabel lblLadoEsquerdo = new JLabel("Lado Esquerdo");
		lblLadoEsquerdo.setBounds(21, 135, 80, 14);
		contentPane.add(lblLadoEsquerdo);
	}
}
