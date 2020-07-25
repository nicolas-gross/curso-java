package ex5;

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
	private JTextField txtN1;
	private JTextField txtN2;

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
		
		JLabel lbl1 = new JLabel("Primeiro n\u00FAmero");
		lbl1.setBounds(21, 26, 109, 14);
		contentPane.add(lbl1);
		
		JLabel lblN2 = new JLabel("Segunda n\u00FAmero");
		lblN2.setBounds(21, 62, 96, 14);
		contentPane.add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(113, 23, 140, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(113, 59, 140, 20);
		contentPane.add(txtN2);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter notas
				double n1 = Double.parseDouble(txtN1.getText());
				double n2 = Double.parseDouble(txtN2.getText());
				
				// Situação
				if(n1 == n2) {
					JOptionPane.showMessageDialog(null, "A soma é "+(n1+n2));
				}else {
					JOptionPane.showMessageDialog(null, "A multiplicação é "+(n1*n2));
				}
				
			}
		});
		btnEnviar.setBounds(84, 99, 89, 23);
		contentPane.add(btnEnviar);
	}
}
