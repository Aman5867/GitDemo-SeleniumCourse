
class finalKeywordDemo {
	
	/*
	final void getData()
	{
		//
	}*/
	
	//final class can not be inherited
	
	public static void main(String[] args) {
		
		final int i=1;
		//i=3; can't change the value of final variable
		
		
		ThisKeywordDemo td=new ThisKeywordDemo();
		td.getData();
		
		
	}

}
