import java.util.Calendar;

public class ClockLogic extends ClockInterface {


	private DigitalClockGUI digitalClockGUI;
	private int clockGUI;
	private int alarmHour;
	private int alarmMinute;
	private int clockIn;
	
	
	// Don't mix instance variables with classes! :)
public ClockLogic(int clockIn, DigitalClockGUI digitalClockGUI){
	this.digitalClockGUI = digitalClockGUI;
	this.clockIn = clockIn;
	
}

public void setAlarm(int hour, int minute){
	this.alarmHour = alarmHour;
	this.alarmMinute = alarmMinute;
}

}
