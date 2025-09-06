import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassDemo {

	public static void main(String[] args) {
		// TODO 
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime())); 
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND));
		System.out.println(cal.get(Calendar.YEAR));

	}

}
