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
	
	public void announceTime() {
		System.out.println("It is " + time.format(currentTime.getTime()));
		incrementHour();
		
	}
	
	public void incrementHour() {
		currentTime.add(Calendar.HOUR, 1);
	}
	
	public String getCurrentTime() {
		return time.format(currentTime.getTime());
	}
}
