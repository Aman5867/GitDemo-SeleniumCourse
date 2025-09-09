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
		
		System.out.println("Printed formatted date");
		System.out.println("Printed formatted date2");
		System.out.println("Printed formatted date3");
		
		System.out.println("printing random things");
		System.out.println("printing random things2");
		System.out.println("printing random things3");

	}

}
