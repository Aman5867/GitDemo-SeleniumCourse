public class ExceptionDemo {
	//try catch mechanism
	
	public static void main(String[] args) {
		
		int a =7;
		int b =0;
		
		try
		{
			int c = a/b;
			System.out.println(c);
//			int[] ar=new int[5];
//			System.out.println(ar[6]); 
		}
		catch(ArithmeticException es)
		{
			System.out.println("I got arithmetic exception!");  
		}
		catch(IndexOutOfBoundsException est)
		{
			System.out.println("I got IndexOutOfBounds exception!");
		}
		catch(Exception e)
		{
			System.out.println("Sorry I got exception!  "+ e.getMessage());
		}
		finally
		{
			System.out.println("delete cookies.");
		}
	}
	
	
	
	
	
	
//	int a=7;
//	int b=0;
//	
//	public void getData()
//	{
//		try {
//		int k=a/b;
//		System.out.println(k); }
//		catch(ArithmeticException et) {System.out.println("I got an ar exception.");}
//		catch(Exception e) {System.out.println("I got an exception.");}
//
//	}
//	
//	public static void main(String[] args) {
//		
//		ExceptionDemo ed=new ExceptionDemo();
//		ed.getData();
//	}
}
