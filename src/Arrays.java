
public class Arrays {

	public static void main(String[] args) {
		
		int a;
		a=4;
		//Array- A container which stores multiple values of same data type
		
		int[] b=new int[5];//Declares an array and allocates memory for the values
		b[0]=2;
		b[1]=6;
		b[2]=13;
		b[3]=0;
		b[4]=9;
		
		int[] c= {1,2,4,7,5,8};
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(c[i]); 
		}

	}

}
