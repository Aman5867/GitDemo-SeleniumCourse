import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {

		Date d=new Date();
		
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(sd1.format(d));

	}

}
