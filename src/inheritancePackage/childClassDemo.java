package inheritancePackage;

public class childClassDemo extends parentClassDemo{
	
	public void Engine()
	{
		System.out.println("New Gen Engine");
	}
	
	public void AudioSystem()
	{
		System.out.println("New Gen Audio System");
	}
	
	public static void main(String[] args) {
		
		childClassDemo a=new childClassDemo();
		a.Gear(); 
		System.out.println(a.color.toUpperCase());
		a.AudioSystem();//function overriding same method same parameter
	}
}
