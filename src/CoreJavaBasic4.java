import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreJavaBasic4 {

	public static void main(String[] args) {
		
		CoreJavaBasic4 ob = new CoreJavaBasic4();
		String name = ob.getData();
		System.out.println(name);
		
		CoreJavaBasic4b ob1 = new CoreJavaBasic4b();
		ob1.getUserData();
		// static makes the method belong to the class, not its object
		getData2();

	}
	
	public String getData()
	{
		System.out.println ("hello world");
		return "rohit shetty"; 
	}
	
	public static String getData2()
	{
		System.out.println ("hello world again");
		return "rohit shetty"; 
	}
	

}
