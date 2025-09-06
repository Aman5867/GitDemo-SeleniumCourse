import demoPackage.FunOverloadingDemo;

public class ThisKeywordDemo extends FunOverloadingDemo{
	
	private int a =2;
	
	protected void getData()
	{
		int a=3;
		System.out.println("Sum: "+(a+this.a)); 
		//this refers to current object of the class
	}
	
	 

	public static void main(String[] args) {
		
		FunOverloadingDemo fd=new FunOverloadingDemo();
		//fd.getData(2); 
		//fd.i=1;
		ThisKeywordDemo a = new ThisKeywordDemo();
		a.getData(3); a.i=1;
	    
	}

}
