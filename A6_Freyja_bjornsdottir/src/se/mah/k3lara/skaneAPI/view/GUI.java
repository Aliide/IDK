package se.mah.k3lara.skaneAPI.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;


public class GUI extends JFrame {


	private JPanel contentPane;
	

	JTextField textField_1= new JTextField();
	JTextField textField_2 = new JTextField();
	JTextArea journeyTextArea = new JTextArea();
	
	JTextField textField = new JTextField();
	JTextArea stationTextArea = new JTextArea();
	
	GUI g= this;
	private Parser p = new Parser();
	Thread t1 = new ThreadJourney(p, this);
	Thread t2 = new ThreadStation(p, this);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 241, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		textField.setBounds(27, 6, 134, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		
		stationTextArea.setBounds(27, 81, 208, 154);
		panel.add(stationTextArea);
		
		JButton btnSk = new JButton("Sök");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t2 = new ThreadStation (p,g);
				t2.start();
					}
		});
		btnSk.setBounds(37, 46, 117, 29);
		panel.add(btnSk);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(255, 6, 189, 252);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		textField_1.setBounds(6, 6, 134, 28);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2.setBounds(6, 46, 134, 28);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
		journeyTextArea.setBounds(6, 113, 177, 133);
		panel_1.add(journeyTextArea);
		
		JButton btnSk_1 = new JButton("Sök resa");
		btnSk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String searchURL = Constants.getURL(textField_1.getText() + "",textField_2.getText(),1);
				//Journeys journeys = Parser.getJourneys(searchURL);
				
				Thread t1 = new ThreadJourney (p,g);
				t1.start();
				/**for  (Journey journey : journeys.getJourneys()){
					textArea_1.setText(journey.getStartStation()+" - ");
					textArea_1.append(journey.getEndStation()+"");
					textArea_1.append(" : "+journey.getLineOnFirstJourney());
					String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
					textArea_1.append("\nDeparts " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. \nAnd it is "+journey.getDepTimeDeviation()+" min late");
					
				} */
			}
			
		});
		btnSk_1.setBounds(23, 75, 117, 29);
		panel_1.add(btnSk_1);
		
	
		
		
	}
}
