public class ConstructorDemo {
	
	//same name as class    //its a special method
	//executed when an obj of the class is created
	//will not return values
	
	public ConstructorDemo()
	{
		System.out.println("I am in the constructor");
	}
	
	//parameterized constructor
	public ConstructorDemo(int a,int b)
	{
		System.out.println("I am in the parameterized constructor");
		System.out.println(a+b);
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getdata()
	{
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo ca = new ConstructorDemo();
		ConstructorDemo cd = new ConstructorDemo("Anti-Inflamatory");
		ConstructorDemo c = new ConstructorDemo(2,1);
	

	}

}
