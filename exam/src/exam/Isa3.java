package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Isa3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtselect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Isa3 frame = new Isa3();
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
	public Isa3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectstr;
				selectstr= comboBox.getSelectedItem().toString();
				txtselect.setText(selectstr);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Goa", "Gujarat", "Bihar"}));
		comboBox.setBounds(176, 86, 130, 27);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(47, 31, 50, 27);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(166, 34, 130, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("State");
		lblNewLabel_1.setBounds(47, 93, 45, 13);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		txtselect = new JTextField();
		txtselect.setBounds(184, 138, 96, 19);
		contentPane.add(txtselect);
		txtselect.setColumns(10);
	}
}
