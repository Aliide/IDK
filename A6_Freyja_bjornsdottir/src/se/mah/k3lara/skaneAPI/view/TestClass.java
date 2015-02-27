package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {

	public static void main(String[] args) {
		//Skriver ut i URL vilka städer den söker mellan.
		String searchURL = Constants.getURL("80000","81216",20); //Malmo C = 80000,  Lund C, 81216 Malmo Gatorg 80100, Hassleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		//Hämtar start och slut stationer samt skriver ut avgångstider. Skriver också om eventuella förseningar. 
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
	  //Hämtar alla möjliga stationer som man lagt in i sin lista samt stationsökningar.
		ArrayList<Station> searchStations = new ArrayList<Station>(); 
		 //skriver ut de olika stationerna
		searchStations.addAll(Parser.getStationsFromURL("Malm"));
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
	}
}

