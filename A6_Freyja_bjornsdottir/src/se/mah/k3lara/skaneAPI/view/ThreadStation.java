package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


public class ThreadStation extends Thread{
	Parser par;
	private GUI gui;
	
	
	public ThreadStation (Parser p, GUI g){
		this.par = p;
		this.gui = g;
	}
	public void run(){
	
		gui.stationTextArea.setText(null);
		
		gui.stationTextArea.setText("loading..");
		
		
		ArrayList<Station> searchStation1 = new ArrayList<Station>();
//System.out.println("hej");
		searchStation1.addAll(Parser.getStationsFromURL(gui.textField.getText()));
		//gui.textArea.setText(null);
	
	for (Station s : searchStation1) {
		//System.out.println("loopar");
		gui.stationTextArea.append(s.getStationName() + " number:"
				+ s.getStationNbr() + "\n");
		
	}
	}
}