package ex2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

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
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbxPedido = new JComboBox();
		cbxPedido.setBounds(30, 56, 373, 22);
		cbxPedido.addItem("Pizza");
		cbxPedido.addItem("Pão de Queijo");
		cbxPedido.addItem("Macarrão");
		cbxPedido.addItem("Pastel");
		contentPane.add(cbxPedido);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Índice do item selecionado
				int pedido = cbxPedido.getSelectedIndex();
				
				// Obter o valor adquirido
				double valor = Double.parseDouble(txtValor.getText());
				
				// Escolha
				double total = 0;
				
				switch (pedido) {
				case 1: total = valor - 12; break;
				case 2: total = valor - 4; break;
				case 3: total = valor - 16; break;
				case 4: total = valor - 4.5; break;
				}
				
				// Total
				if(total < 0) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}else {
					JOptionPane.showMessageDialog(null, "R$ "+total);
				}
				
			}
		});
		btnEnviar.setBounds(164, 147, 89, 23);
		contentPane.add(btnEnviar);
		
		txtValor = new JTextField();
		txtValor.setBounds(110, 100, 293, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setBounds(30, 103, 70, 14);
		contentPane.add(lblValorPago);
	}
}
