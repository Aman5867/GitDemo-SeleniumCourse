
public class CoreJavaBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myNum = 5;
		String website = "Rohit Shetty Films";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		//System.out.println(myNum + " is the value stored in myNum variable");
		//System.out.println(website);
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6};
		
		//for loop 
		for(int i=0; i<arr.length; i++ )
		{
			System.out.println(arr[i]);
			System.out.println("Printing array");
		}
		
		String[] name = {"shafaat", "aman","selenium"};
		
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s:name)
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
