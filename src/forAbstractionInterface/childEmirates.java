package forAbstractionInterface;

public class childEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childEmirates c=new childEmirates();
		c.engine();
		c.bodyColor();
		c.safety();
		

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Body Color");
	}

}
