package LabXXIV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumeroAleatorio {

	private JFrame frmTratamentoDeEventos;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumeroAleatorio window = new NumeroAleatorio();
					window.frmTratamentoDeEventos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumeroAleatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTratamentoDeEventos = new JFrame();
		frmTratamentoDeEventos.setTitle("Tratamento de eventos da própria classe - Exemplo 1");
		frmTratamentoDeEventos.setBounds(100, 100, 450, 131);
		frmTratamentoDeEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTratamentoDeEventos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero Aleatório:");
		lblNewLabel.setBounds(32, 44, 123, 13);
		frmTratamentoDeEventos.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(165, 41, 96, 19);
		frmTratamentoDeEventos.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setMnemonic('C');
		btnNewButton.setBounds(289, 40, 55, 21);
		frmTratamentoDeEventos.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Apagar");
		btnNewButton_1.setMnemonic('A');
		btnNewButton_1.setBounds(354, 40, 65, 21);
		frmTratamentoDeEventos.getContentPane().add(btnNewButton_1);
	}

}
