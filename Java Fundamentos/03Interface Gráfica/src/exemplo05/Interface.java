package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Interface {
	
	// DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
	// Construtor
	public Interface() {
		formulario();
	}

	// Método JFrame
	private void formulario() {
		
		// JFrame
		JFrame f = new JFrame();
		f.setSize(350, 300);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Adicionando componentes
		f.add(painelCadastro());
		f.add(painelListagem());
		
		// Exibir JFrame e demais componentes
		f.setVisible(true);
		
	}
	
	// Painel de cadastro
	private JPanel painelCadastro() {
		
		// Instânciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 5, 323, 120);
		p.setBorder(BorderFactory.createLineBorder(Color.gray));
		p.setLayout(null);
		
		// Componentes
		JLabel rotuloNome = new JLabel("Informe seu nome");
		rotuloNome.setBounds(5, 5, 120, 20);
		JLabel rotuloNota1 = new JLabel("Informe sua 1ª nota");
		rotuloNota1.setBounds(5, 35, 120, 20);
		JLabel rotuloNota2 = new JLabel("Informe sua 2ª nota");
		rotuloNota2.setBounds(5, 65, 120, 20);

		JTextField campoNome = new JTextField();
		campoNome.setBounds(120, 5, 200, 20);
		JTextField campoNota1 = new JTextField();
		campoNota1.setBounds(120, 35, 200, 20);
		JTextField campoNota2 = new JTextField();
		campoNota2.setBounds(120, 65, 200, 20);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(110, 95, 100, 20);
		
		// Evento de clique
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter os dados
				String nome = campoNome.getText();
				double nota1 = Double.parseDouble(campoNota1.getText());
				double nota2 = Double.parseDouble(campoNota2.getText());
				
				// Média
				double media = (nota1+nota2)/2;
				
				// Adicionar no DefaultTableModel
				dados.addRow(new Object[] { nome, nota1, nota2, media });
				
				// Limpar os campos
				campoNome.setText("");
				campoNota1.setText("");
				campoNota2.setText("");
				
				// Mensagem
				JOptionPane.showMessageDialog(null, "Aluno cadastrado");
				
			}
		});
		
		// Adicionar componentes ao painel
		p.add(rotuloNome);
		p.add(rotuloNota1);
		p.add(rotuloNota2);
		p.add(campoNome);
		p.add(campoNota1);
		p.add(campoNota2);
		p.add(btnCadastrar);
		
		// Retorno
		return p;
		
	}
	
	// Painel de listagem
	private JPanel painelListagem() {
		
		// Instânciar um objeto da classe JPanel
		JPanel p = new JPanel();
		p.setBounds(5, 135, 323, 120);
		p.setBorder(BorderFactory.createLineBorder(Color.gray));
		p.setLayout(null);
		
		// Característica do DefaultTableModel
		dados.addColumn("Nome");
		dados.addColumn("1ª Nota");
		dados.addColumn("2ª Nota");
		dados.addColumn("Média");
		
		// Tabela
		JTable tabela = new JTable(dados);
		
		// Barra de rolagem e cabeçalho
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(0, 0, 323, 120);
		
		// Adicionar ao painel
		p.add(barra);
		
		// Retorno
		return p;
		
	}
	
}






