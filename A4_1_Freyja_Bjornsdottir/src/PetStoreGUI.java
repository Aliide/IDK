import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PetStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuman;
	private JTextField txtDog;
	private JTextField textField;
	private JTextField textField_1;
	public Human human;
	public Dog dog;
	private final int MIN_SIZE = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetStoreGUI frame = new PetStoreGUI();
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
	public PetStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewOwner = new JButton("New Owner");
		btnNewOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (String.valueOf(txtHuman.getText()).length()>= MIN_SIZE){
					human = new Human(String.valueOf(txtHuman.getText()));
					System.out.println(human.getName());
				}else{
					textField_1.setText("Invalid Name");		
				}
			}

		});
		btnNewOwner.setBounds(17, 33, 117, 29);
		contentPane.add(btnNewOwner);

		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (human != null){
					dog = new Dog(String.valueOf(txtDog.getText()));
					System.out.println(dog.getName());
					human.buyDog(dog);
				}else{
					textField_1.setText("Error");
				}
			}

		});
		btnBuyDog.setBounds(17, 74, 117, 29);
		contentPane.add(btnBuyDog);

		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human != null) { // Added null check
					textField.setText(human.getInfo());
				}
			}
		});
		btnPrintInfo.setBounds(17, 115, 117, 29);
		contentPane.add(btnPrintInfo);

		txtHuman = new JTextField();
		txtHuman.setBounds(146, 32, 134, 28);
		contentPane.add(txtHuman);
		txtHuman.setColumns(10);

		txtDog = new JTextField();
		txtDog.setBounds(146, 73, 134, 28);
		contentPane.add(txtDog);
		txtDog.setColumns(10);

		JLabel lblOwnerAndDog = new JLabel("Human and Dog");
		lblOwnerAndDog.setBounds(58, 5, 167, 16);
		contentPane.add(lblOwnerAndDog);

		textField = new JTextField();
		textField.setBounds(27, 166, 372, 51);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(27, 145, 61, 16);
		contentPane.add(lblInfo);

		JLabel lblError = new JLabel("Error");
		lblError.setBounds(17, 213, 61, 16);
		contentPane.add(lblError);

		textField_1 = new JTextField();
		textField_1.setBounds(17, 229, 382, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
