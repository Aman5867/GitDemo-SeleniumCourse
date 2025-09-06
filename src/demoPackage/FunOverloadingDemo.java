package demoPackage;

public  class FunOverloadingDemo{
	protected int i=3; 
	
	protected void getData(int a)
	{
		System.out.println("The no is "+a);
	}
	
	public void getData(String a)
	{
		System.out.println("The string is "+a);
	}
	
	public void getData(String a,int b)
	{
		System.out.println("The o/p is "+b+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunOverloadingDemo f=new FunOverloadingDemo();
		f.getData(9);
		f.getData("Cucumber");  
		f.getData("mangoes", 12);
	
	}

}
