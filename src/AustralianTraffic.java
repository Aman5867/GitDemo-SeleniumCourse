import demoPackage.CentralTraffic;

//interface Class

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.yellowWait();
		
		
		AustralianTraffic at=new AustralianTraffic();
		at.walk();
		at.speedLimit();
		
	}

	
	public void walk()
	{
		System.out.println("walk");
	}
	
	
	public void redStop() {
		
		System.out.println("Red signal implementation.");
		
	}

	
	public void yellowWait() {
		
		System.out.println("Yellow signal implementation.");
		
	}


	
	public void greenGo() {
		
		System.out.println("Green signal implementation.");
		
	}


	@Override
	public void speedLimit() {
		// TODO Auto-generated method stub
		System.out.println("Speed limit Implemented");
		
	}

}
