package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Font;
import java.util.Calendar;
import javax.swing.SwingConstants;

public class GUI extends JFrame {

	private JPanel contentPane;
	private SearchThread t;
	JLabel labelLinje1 = new JLabel("");
	JLabel labelLinje2 = new JLabel("");
	JLabel labelLinje3 = new JLabel("");
	JLabel labelLinje4 = new JLabel("");
	
	JLabel labelDes1 = new JLabel("");
	JLabel labelDes2 = new JLabel("");
	JLabel labelDes3 = new JLabel("");
	JLabel labelDes4 = new JLabel("");
	
	JLabel labelTime1 = new JLabel("");
	JLabel labelTime2 = new JLabel("");
	JLabel labelTime3 = new JLabel("");
	JLabel labelTime4 = new JLabel("");
	
	JLabel labelLate1 = new JLabel("");
	JLabel labelLate2 = new JLabel("");
	JLabel labelLate3 = new JLabel("");
	JLabel labelLate4 = new JLabel("");
	private final JLabel lblSenmin = new JLabel("Sen (min)");

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
		setFont(new Font("Helvetica", Font.BOLD, 20));
		setTitle("Sk\u00E5netrafiken");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUbtshallen = new JLabel("Ub\u00E5tshallen");
		lblUbtshallen.setForeground(Color.DARK_GRAY);
		lblUbtshallen.setFont(new Font("Helvetica", Font.BOLD, 25));
		lblUbtshallen.setBackground(new Color(240, 240, 240));
		lblUbtshallen.setBounds(204, 6, 175, 31);
		contentPane.add(lblUbtshallen);
		
		JLabel lblLinje = new JLabel("Linje");
		lblLinje.setForeground(Color.DARK_GRAY);
		lblLinje.setFont(new Font("Helvetica", Font.BOLD, 20));
		lblLinje.setBounds(103, 46, 49, 26);
		contentPane.add(lblLinje);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Helvetica", Font.BOLD, 20));
		lblDestination.setForeground(Color.DARK_GRAY);
		lblDestination.setBounds(185, 46, 152, 26);
		contentPane.add(lblDestination);
		
		JLabel lblAvgar = new JLabel("Avg\u00E5r");
		lblAvgar.setForeground(Color.DARK_GRAY);
		lblAvgar.setFont(new Font("Helvetica", Font.BOLD, 20));
		lblAvgar.setBounds(17, 49, 56, 21);
		contentPane.add(lblAvgar);
		
		
		labelLinje1.setForeground(Color.WHITE);
		labelLinje1.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelLinje1.setBounds(123, 70, 84, 31);
		contentPane.add(labelLinje1);
		
		
		labelLinje2.setForeground(Color.WHITE);
		labelLinje2.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelLinje2.setBounds(123, 114, 84, 31);
		contentPane.add(labelLinje2);
		
		
		labelLinje3.setForeground(Color.WHITE);
		labelLinje3.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelLinje3.setBounds(123, 158, 84, 31);
		contentPane.add(labelLinje3);
		
		
		labelLinje4.setForeground(Color.WHITE);
		labelLinje4.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelLinje4.setBounds(123, 202, 84, 31);
		contentPane.add(labelLinje4);
		
		
		labelDes1.setForeground(Color.WHITE);
		labelDes1.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelDes1.setBounds(185, 71, 240, 31);
		contentPane.add(labelDes1);
		
		
		labelDes2.setForeground(Color.WHITE);
		labelDes2.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelDes2.setBounds(185, 114, 240, 31);
		contentPane.add(labelDes2);
		
		
		labelDes3.setForeground(Color.WHITE);
		labelDes3.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelDes3.setBounds(185, 158, 240, 31);
		contentPane.add(labelDes3);
		
		
		labelDes4.setForeground(Color.WHITE);
		labelDes4.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelDes4.setBounds(185, 202, 240, 31);
		contentPane.add(labelDes4);
		
		
		labelTime1.setForeground(Color.BLUE);
		labelTime1.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelTime1.setBounds(17, 70, 84, 31);
		contentPane.add(labelTime1);
		
		
		labelTime2.setForeground(Color.BLUE);
		labelTime2.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelTime2.setBounds(17, 114, 84, 31);
		contentPane.add(labelTime2);
		
		
		labelTime3.setForeground(Color.BLUE);
		labelTime3.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelTime3.setBounds(17, 158, 84, 31);
		contentPane.add(labelTime3);
		
		
		labelTime4.setForeground(Color.BLUE);
		labelTime4.setFont(new Font("Helvetica", Font.PLAIN, 20));
		labelTime4.setBounds(17, 202, 84, 31);
		contentPane.add(labelTime4);
		
		  labelLate1.setForeground(Color.WHITE);
		  labelLate1.setFont(new Font("Helvetica", Font.PLAIN, 20));
		  labelLate1.setBounds(437, 70, 70, 31);
		  contentPane.add(labelLate1);
		  
		  labelLate2.setForeground(Color.WHITE);
		  labelLate2.setFont(new Font("Helvetica", Font.PLAIN, 20));
		  labelLate2.setBounds(437, 114, 70, 31);
		  
		  contentPane.add(labelLate2);
		  labelLate3.setForeground(Color.WHITE);
		  labelLate3.setFont(new Font("Helvetica", Font.PLAIN, 20));
		  labelLate3.setBounds(437, 158, 70, 31);
		  
		  contentPane.add(labelLate3);
		  labelLate4.setForeground(Color.WHITE);
		  labelLate4.setFont(new Font("Helvetica", Font.PLAIN, 20));
		  labelLate4.setBounds(437, 202, 70, 31);
		  
		  contentPane.add(labelLate4);
		  lblSenmin.setForeground(Color.DARK_GRAY);
		  lblSenmin.setFont(new Font("Helvetica", Font.BOLD, 20));
		  lblSenmin.setBounds(438, 46, 106, 26);
		  
		  contentPane.add(lblSenmin);
		  
		  	UpdateLables();
		  	Thread t = new SearchThread (this); 
		  	t.start();
			  
	}
	
	public void UpdateLables(){
		Lines lines = Parser.getStationResults(new Station("80046"));

		  labelLinje1.setText(lines.getLines().get(0).getLine());
		  labelLinje2.setText(lines.getLines().get(1).getLine());
		  labelLinje3.setText(lines.getLines().get(2).getLine());
		  labelLinje4.setText(lines.getLines().get(3).getLine());
		  
		  labelDes1.setText(lines.getLines().get(0).getDestination());
		  labelDes2.setText(lines.getLines().get(1).getDestination());
		  labelDes3.setText(lines.getLines().get(2).getDestination());
		  labelDes4.setText(lines.getLines().get(3).getDestination());
		  
		  labelTime1.setText(FixThatClock(lines.getLines().get(0).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixThatClock(lines.getLines().get(0).getDepTime().get(Calendar.MINUTE)));
		  labelTime2.setText(FixThatClock(lines.getLines().get(1).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixThatClock(lines.getLines().get(1).getDepTime().get(Calendar.MINUTE)));
		  labelTime3.setText(FixThatClock(lines.getLines().get(2).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixThatClock(lines.getLines().get(2).getDepTime().get(Calendar.MINUTE)));
		  labelTime4.setText(FixThatClock(lines.getLines().get(3).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixThatClock(lines.getLines().get(3).getDepTime().get(Calendar.MINUTE)));
		
		  labelLate1.setText(lines.getLines().get(0).getDepTimeDeviation());
		  labelLate2.setText(lines.getLines().get(1).getDepTimeDeviation());
		  labelLate3.setText(lines.getLines().get(2).getDepTimeDeviation());
		  labelLate4.setText(lines.getLines().get(3).getDepTimeDeviation());
	}
	
	public String FixThatClock(int time){
		  // Some variables that will create a '0' if a number is single digit, to
		  // make it nicer.
		  String zero = "";

		  if (time < 10) {
		   zero = "0";
		  }

		  // Compiles the values to nice, readable strings.
		  String finalTimeString = zero + Integer.toString(time);

		  zero = "";
		  
		  return finalTimeString;
		 }
	
}
