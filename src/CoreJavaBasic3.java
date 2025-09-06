
public class CoreJavaBasic3 {

	public static void main(String[] args) {
		
		// string is an object (in java),that represents sequence of characters
		//string literal       (if value is same, no new obj is created)
		//String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		String s4 = "hello";//new obj is created here
		
		//new keyword
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=s.length()-1;i>=0 ;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		

	}

}
