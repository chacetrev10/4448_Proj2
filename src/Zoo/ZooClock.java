package Zoo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ZooClock {
	private String timeFormat = "h:mm a";
	private SimpleDateFormat time = new SimpleDateFormat(timeFormat);
	private String zooOpening = "8:00 am";
	private Calendar currentTime = Calendar.getInstance();
	
	public ZooClock() throws ParseException{
		this.currentTime.setTime(time.parse(zooOpening));
	}
	
	//Announce current time of day to zoo
	public void announceTime() {
		System.out.println("It is " + time.format(currentTime.getTime()));
		incrementHour();
		
	}
	
	//Increment time of day by 1 hour
	private void incrementHour() {
		currentTime.add(Calendar.HOUR, 1);
	}
	
	//Get the current time of day
	public String getCurrentTime() {
		return time.format(currentTime.getTime());
	}
}
