package se.mah.k3lara.skaneAPI.view;


import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class ThreadJourney extends Thread {
	 Parser par;
	private GUI gui;
	public ThreadJourney (Parser p, GUI g){
		this.par = p;
		this.gui = g;
	}
	@Override
	public void run(){
		gui.stationTextArea.setText(null);
		
		gui.stationTextArea.setText("loading..");
		
		
		String searchURL1 = Constants.getURL(gui.textField_1.getText() + "",
				gui.textField_2.getText(), 1);
		Journeys journeys1 = Parser.getJourneys(searchURL1);
		gui.journeyTextArea.setText(null);
		for (Journey journey : journeys1.getJourneys()) {
			gui.journeyTextArea.append(journey.getStartStation() + " - "
					+ journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)
					+ ":" + journey.getDepDateTime().get(Calendar.MINUTE);
			gui.journeyTextArea.append(" Departs " + time + " that is in "
					+ journey.getTimeToDeparture() + " minutes. And it is "
					+ journey.getDepTimeDeviation() + " min late");
		}
	}
	}