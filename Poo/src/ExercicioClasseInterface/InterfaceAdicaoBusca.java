package ExercicioClasseInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class InterfaceAdicaoBusca {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAdicaoBusca window = new InterfaceAdicaoBusca();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceAdicaoBusca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(23, 22, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero");
		lblNewLabel_1.setBounds(23, 45, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(58, 19, 300, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 42, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				if((fileChooser.showSaveDialog(lblNewLabel)) == JFileChooser.CANCEL_OPTION) {
					System.exit(1);
				}
				file = fileChooser.getSelectedFile();
				try {
					BufferedWriter writerBuffer = new BufferedWriter(new FileWriter(file, true));
					if((file.getName().equals(""))) {
						writerBuffer.write(textField.getText() + " " + textField_1.getText());
					} else {
						writerBuffer.newLine();
						writerBuffer.append(textField.getText() + " " + textField_1.getText());
					}
					
					writerBuffer.close();
				} catch (IOException el){
					el.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(49, 122, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				if((fileChooser.showOpenDialog(lblNewLabel)) == JFileChooser.CANCEL_OPTION) {
					System.exit(1);
				}
				file = fileChooser.getSelectedFile();
				try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
					String currentLine;
			        int lineNumber = 0;
			            // Lê cada linha do arquivo até o final
		            while ((currentLine = reader.readLine()) != null) {
		            	lineNumber++; // Incrementa o contador de linha
			                // Verifica se a linha atual contém a sequência procurada
		                if (currentLine.contains(textField.getText() + " " + textField_1.getText())) {
		                	System.out.println("String encontrada na linha " + lineNumber + ": " + currentLine);
		                }
		            }
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(215, 122, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
