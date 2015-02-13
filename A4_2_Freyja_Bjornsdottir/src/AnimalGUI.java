import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		
		ArrayList<Animal> animals = new ArrayList <Animal>();
		Cat cat = new Cat(" Felis catus", 70, 7);
		cat.setFriendlyName("Katten");
		Cat cat_1 = new Cat(" Felis catus", 70, 2);
		cat_1.setFriendlyName("Majsan");
		Cat cat_2 = new Cat(" Felis catus", 70, 9);
		cat_2.setFriendlyName("Ernst");
		Cat cat_3 = new Cat(" Felis catus", 70, 1);
		cat_3.setFriendlyName("Carl-Anders");
		
		animals.add(new Dog(" Canis lupus familiaris",20,false, "Lillen"));
		animals.add(cat);
		animals.add(cat_1);
		animals.add(new Snake(" Anguis",false));
		animals.add(cat_2);
		animals.add(new Dog(" Canis lupus familiaris",20,true, "Lipton"));
		animals.add(new Snake(" Anguis",true));
		animals.add(new Dog(" Canis lupus familiaris",20,false, "Jakob"));
		animals.add(new Snake(" Anguis",true));
		animals.add(cat_3);	
		animals.add(new Dog(" Canis lupus familiaris",20,true, "Annmarie"));
		animals.add(new Snake(" Anguis",false));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 34, 413, 209);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		for (int i = 0; i < animals.size(); i++){
			textArea.append(animals.get(i).getInfo() + "\n");
		}
	}
}
