package src.Kanban;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Gerald extends JFrame {

	private JLayeredPane contentPane;
	private JTextField tareaName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerald frame = new Gerald();
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
	public Gerald() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 495);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelTITLE = new JLabel("Programa de Gerald");
		lblNewLabelTITLE.setFont(new Font("Calisto MT", Font.PLAIN, 30));
		lblNewLabelTITLE.setBounds(117, 11, 263, 37);
		contentPane.add(lblNewLabelTITLE);
		
		tareaName = new JTextField();
		tareaName.setText("...");
		tareaName.setBounds(166, 69, 265, 20);
		contentPane.add(tareaName);
		tareaName.setColumns(10);
		
		textField = new JTextField();
		textField.setText("...");
		textField.setColumns(10);
		textField.setBounds(166, 119, 265, 53);
		contentPane.add(textField);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDescription.setBounds(59, 117, 90, 22);
		contentPane.add(lblDescription);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTitle.setBounds(59, 66, 37, 24);
		contentPane.add(lblTitle);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Arial", Font.PLAIN, 18));
		lblState.setBounds(59, 198, 42, 22);
		contentPane.add(lblState);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCategory.setBounds(59, 252, 73, 22);
		contentPane.add(lblCategory);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPriority.setBounds(59, 312, 56, 22);
		contentPane.add(lblPriority);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Arial", Font.PLAIN, 18));
		lblUser.setBounds(59, 357, 38, 22);
		contentPane.add(lblUser);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDueDate.setBounds(59, 403, 76, 22);
		contentPane.add(lblDueDate);
		
		textField_1 = new JTextField();
		textField_1.setText("...");
		textField_1.setColumns(10);
		textField_1.setBounds(166, 254, 265, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("...");
		textField_2.setColumns(10);
		textField_2.setBounds(166, 359, 265, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("...");
		textField_3.setColumns(10);
		textField_3.setBounds(166, 405, 265, 20);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "DO TO", "IN PROGRESS", "DONE"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(166, 200, 265, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_1.setBounds(166, 312, 265, 20);
		contentPane.add(comboBox_1);
	}
}
