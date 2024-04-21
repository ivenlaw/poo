package LabXXIII;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Janela {

	private JFrame frmMarcaoDeFaltas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Janela window = new Janela();
					window.frmMarcaoDeFaltas.setVisible(true);
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

		frmMarcaoDeFaltas = new JFrame();

		frmMarcaoDeFaltas.setTitle("Marcação de faltas");

		frmMarcaoDeFaltas.setBounds(100, 100, 630, 300);

		frmMarcaoDeFaltas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmMarcaoDeFaltas.getContentPane().setLayout(null);

		

		JLabel lblNewLabel_1 = new JLabel("Nome");

		lblNewLabel_1.setBounds(39, 67, 56, 14);

		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);

		frmMarcaoDeFaltas.getContentPane().add(lblNewLabel_1);

		

		JLabel lblNewLabel = new JLabel("Numero");

		lblNewLabel.setBounds(39, 42, 56, 14);

		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);

		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);

		frmMarcaoDeFaltas.getContentPane().add(lblNewLabel);

		

		textField = new JTextField();

		textField.setBounds(105, 39, 86, 20);

		frmMarcaoDeFaltas.getContentPane().add(textField);

		textField.setColumns(10);

		

		textField_1 = new JTextField();

		textField_1.setBounds(105, 65, 464, 17);

		frmMarcaoDeFaltas.getContentPane().add(textField_1);

		textField_1.setColumns(10);

		

		JLabel lblNewLabel_2 = new JLabel("Regime");

		lblNewLabel_2.setBounds(39, 106, 46, 14);

		frmMarcaoDeFaltas.getContentPane().add(lblNewLabel_2);

		

		JRadioButton rbDiurno = new JRadioButton("Diurno");

		rbDiurno.setBounds(91, 102, 65, 23);

		frmMarcaoDeFaltas.getContentPane().add(rbDiurno);

		

		JRadioButton rbNoturno = new JRadioButton("Nocturno");

		rbNoturno.setBounds(158, 102, 86, 23);

		frmMarcaoDeFaltas.getContentPane().add(rbNoturno);

		

		ButtonGroup rb = new ButtonGroup();

		rb.add(rbNoturno);

		rb.add(rbDiurno);

		

		JLabel lblNewLabel_3 = new JLabel("Número de faltas:");

		lblNewLabel_3.setBounds(39, 151, 117, 14);

		frmMarcaoDeFaltas.getContentPane().add(lblNewLabel_3);

		

		textField_2 = new JTextField();

		textField_2.setBounds(158, 148, 86, 20);

		frmMarcaoDeFaltas.getContentPane().add(textField_2);

		textField_2.setColumns(10);

		

		JButton btnNewButton = new JButton("Primeiro");

		btnNewButton.setMnemonic('P');

		btnNewButton.setBounds(36, 193, 89, 23);

		frmMarcaoDeFaltas.getContentPane().add(btnNewButton);

		

		JButton btnNewButton_1 = new JButton("Anterior");

		btnNewButton_1.setMnemonic('A');

		btnNewButton_1.setBounds(143, 193, 89, 23);

		frmMarcaoDeFaltas.getContentPane().add(btnNewButton_1);

		

		JButton btnNewButton_2 = new JButton("Seguinte");

		btnNewButton_2.setMnemonic('S');

		btnNewButton_2.setBounds(264, 193, 89, 23);

		frmMarcaoDeFaltas.getContentPane().add(btnNewButton_2);

		

		JButton btnNewButton_3 = new JButton("Ultimo");

		btnNewButton_3.setMnemonic('U');

		btnNewButton_3.setBounds(386, 193, 89, 23);

		frmMarcaoDeFaltas.getContentPane().add(btnNewButton_3);

		

		JButton btnNewButton_4 = new JButton("Novo");

		btnNewButton_4.setMnemonic('N');

		btnNewButton_4.setBounds(515, 193, 89, 23);

		frmMarcaoDeFaltas.getContentPane().add(btnNewButton_4);

	}

}

