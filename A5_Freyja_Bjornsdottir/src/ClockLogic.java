import java.util.Calendar;

public class ClockLogic extends ClockInterface {


	private DigitalClockGUI clockGUI;
	private int DigitalClockGUI;
	private int alarmHour;
	private int alarmMinute;
	private int clockIn;
	
	
public ClockLogic(clockIn, DigitalClockGUI){
	this.DigitalClockGUI = DigitalClockGUI;
	this.clockIn = clockIn;
	
}

public void setAlarm(int hour, int minute){
	this.alarmHour = alarmHour;
	this.alarmMinute = alarmMinute;
}

}
