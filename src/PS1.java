//import org.testng.annotations.Test;// super keyword

public class PS1 extends PS{

		// Child Class
		//Inheritance in Java is acquiring properties of the parent class.
		// super keyword
		
//		@Test
//		public void testRun() 
//		{
//			doThis();
//		}

		String name="Sachin";
		
		public PS1(int name)
		{
			super(name);
			System.out.println("child class constructor");
		}
	
		public void getStringdata()
		{
			System.out.println(super.name); 
			System.out.println(name);
		}
		
		public void getData() 
		{

			//super.getData();
			System.out.println("I am in child class.");
		}
		
		public void parentgetData() 
		{

			super.getData();
		}
		
		public static void main(String[] args)
		{
			PS1 p=new PS1(2);
			
			//p.getStringdata();
			p.getData(); 
			p.parentgetData();
			
		}
	
	

	

}
