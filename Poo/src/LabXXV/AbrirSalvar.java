package LabXXV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AbrirSalvar {

	private JFrame frmEditorDeTexto;
	private File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrirSalvar window = new AbrirSalvar();
					window.frmEditorDeTexto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AbrirSalvar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditorDeTexto = new JFrame();
		frmEditorDeTexto.setBackground(new Color(240, 240, 240));
		frmEditorDeTexto.setTitle("Editor de texto");
		frmEditorDeTexto.setBounds(100, 100, 447, 300);
		frmEditorDeTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditorDeTexto.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 0, 436, 180);
		frmEditorDeTexto.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.setMnemonic('L');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				if((fileChooser.showOpenDialog(editorPane)) == JFileChooser.CANCEL_OPTION) {
					System.exit(1);
				}
				file = fileChooser.getSelectedFile();
				try {
					editorPane.setPage(file.toURI().toString());
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(52, 207, 85, 21);
		frmEditorDeTexto.getContentPane().add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setMnemonic('S');
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				if((fileChooser.showSaveDialog(frmEditorDeTexto)) == JFileChooser.CANCEL_OPTION) {
					System.exit(1);
				}
				file = fileChooser.getSelectedFile();
				try {
					PrintWriter writer = new PrintWriter (new FileWriter(file), true);
					writer.println(editorPane.getText());
					writer.close();
				} catch (IOException el){
					el.printStackTrace();
				}
			}
		});
		btnSave.setBounds(206, 207, 85, 21);
		frmEditorDeTexto.getContentPane().add(btnSave);
	}

}
