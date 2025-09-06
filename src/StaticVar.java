public class StaticVar {
	
	String name;  //instance variables: tied-up/depends to/on the instance (or object) of class
	String address;
	static String city; //class variables
	static int i;
	static {
		city="Bangalore";
		i=0;
	}
	
	StaticVar(String name,String address)
	{
		this.name=name;
		this.address=address;	
		i++;
		System.out.println(i); 
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	} 
	
	public static void getCity()
	{
		System.out.println(city); 
	}
	
	public static void main(String[] args) {
		
		StaticVar obj=new StaticVar("Ram","Marthalli");
		StaticVar obj1=new StaticVar("Sid","Jayanagar");
		StaticVar obj2=new StaticVar("Sid","Jayanagar");
		obj.getAddress();
		obj1.getAddress();
		System.out.println(city);
		StaticVar.city="Agra"; 
		getCity(); StaticVar.getCity();
		obj.address="xyz";
	}

}
