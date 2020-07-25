package ex4;

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
	private JTextField txtc1;
	private JTextField txtc5;
	private JTextField txtc10;
	private JTextField txtc25;
	private JTextField txtc50;
	private JTextField txtr1;

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
		setBounds(100, 100, 279, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel c01 = new JLabel("R$0,01");
		c01.setBounds(21, 26, 80, 14);
		contentPane.add(c01);
		
		JLabel c05 = new JLabel("R$0,05");
		c05.setBounds(21, 62, 80, 14);
		contentPane.add(c05);
		
		txtc1 = new JTextField();
		txtc1.setBounds(113, 23, 140, 20);
		contentPane.add(txtc1);
		txtc1.setColumns(10);
		
		txtc5 = new JTextField();
		txtc5.setColumns(10);
		txtc5.setBounds(113, 59, 140, 20);
		contentPane.add(txtc5);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				int c1 = Integer.parseInt(txtc1.getText());
				int c5 = Integer.parseInt(txtc5.getText());
				int c10 = Integer.parseInt(txtc10.getText());
				int c25 = Integer.parseInt(txtc25.getText());
				int c50 = Integer.parseInt(txtc50.getText());
				int r1 = Integer.parseInt(txtr1.getText());
				
				// Calculo
				double total  = (c1*0.01);
						     total+= (c5*0.05);
						     total+= (c10*0.10);
						     total+= (c25*0.25);
						     total+= (c50*0.50);
						     total+= (r1*1.00);
				
				// Mensagem
				JOptionPane.showMessageDialog(null, "R$"+total);
				
			}
		});
		btnEnviar.setBounds(82, 247, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel c10 = new JLabel("R$0,10");
		c10.setBounds(21, 99, 80, 14);
		contentPane.add(c10);
		
		txtc10 = new JTextField();
		txtc10.setColumns(10);
		txtc10.setBounds(113, 96, 140, 20);
		contentPane.add(txtc10);
		
		txtc25 = new JTextField();
		txtc25.setColumns(10);
		txtc25.setBounds(113, 132, 140, 20);
		contentPane.add(txtc25);
		
		JLabel c25 = new JLabel("R$0,25");
		c25.setBounds(21, 135, 80, 14);
		contentPane.add(c25);
		
		JLabel c50 = new JLabel("R$0,50");
		c50.setBounds(21, 170, 80, 14);
		contentPane.add(c50);
		
		txtc50 = new JTextField();
		txtc50.setColumns(10);
		txtc50.setBounds(113, 167, 140, 20);
		contentPane.add(txtc50);
		
		JLabel r1 = new JLabel("R$1,00");
		r1.setBounds(21, 210, 80, 14);
		contentPane.add(r1);
		
		txtr1 = new JTextField();
		txtr1.setColumns(10);
		txtr1.setBounds(113, 207, 140, 20);
		contentPane.add(txtr1);
	}
}
