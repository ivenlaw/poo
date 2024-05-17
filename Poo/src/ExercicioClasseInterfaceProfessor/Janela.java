package ExercicioClasseInterfaceProfessor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frmAgendaTelefonica;
	private JTextField txtNome;
	private JTextField txtNumero;
	private Agenda agenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frmAgendaTelefonica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		agenda = new Agenda();
		frmAgendaTelefonica = new JFrame();
		frmAgendaTelefonica.setTitle("AGENDA TELEFÔNICA");
		frmAgendaTelefonica.setBounds(100, 100, 369, 242);
		frmAgendaTelefonica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgendaTelefonica.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setBounds(38, 36, 55, 16);
		frmAgendaTelefonica.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NUMERO:");
		lblNewLabel_1.setBounds(38, 81, 69, 16);
		frmAgendaTelefonica.getContentPane().add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(95, 34, 226, 20);
		frmAgendaTelefonica.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(95, 79, 226, 20);
		frmAgendaTelefonica.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= txtNome.getText();
				String numero = txtNumero.getText();
				
				try {
					agenda.addContato(new Contato(nome, numero));
					JOptionPane.showMessageDialog(frmAgendaTelefonica, "Contato adicionado com sucesso");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(frmAgendaTelefonica, "Erro ao adicionar contato");
				}
			}
		});
		btnNewButton.setBounds(38, 141, 99, 26);
		frmAgendaTelefonica.getContentPane().add(btnNewButton);
		
		JButton btnBuecar = new JButton("BUSCAR");
		btnBuecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				try {
					String contato = agenda.buscarContato(nome);
					JOptionPane.showMessageDialog(frmAgendaTelefonica, contato);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(frmAgendaTelefonica, "Contato não encontrado");
				}
			}
		});
		btnBuecar.setBounds(222, 141, 99, 26);
		frmAgendaTelefonica.getContentPane().add(btnBuecar);
	}
}
