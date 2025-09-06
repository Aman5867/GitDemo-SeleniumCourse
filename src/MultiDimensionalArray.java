
public class MultiDimensionalArray {

	public static void main(String[] args) {
		
//		int[][] a=new int[2][3]; 
//		a[0][0]=1; 
//		a[0][1]=2;
//		a[0][2]=3;
//		a[1][0]=4; 
//		a[1][1]=5;
//		a[1][2]=6; 
		//System.out.println(a[1][0]);
		
//		for (int i=0;i<2;i++)
//		{
//			for (int j=0;j<=2;j++)
//			{
//				System.out.println(a[i][j]);
//			}
//		}
		//find minimum no in the 3*3 array
//		int[][] b = {{2,4,5},{3,4,7},{1,2,9}};
//		int min=b[0][0];
//
//		for (int i=0;i<3;i++)
//		{
//			for (int j=0;j<3;j++)
//			{
//				if (b[i][j] < min)
//				{
//					min=b[i][j];
//				} 
//			}
//		}
//		System.out.println(min); 
		
		
		//find the max no in the column of the minimum no--preferred way
		int[][] b = {{2,4,5},
					 {3,4,7},
					 {1,2,9}};
		int min=b[0][0];
		int k=0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (b[i][j] < min)
				{
					min=b[i][j];
					k=j;
				} 
			}
		}
		System.out.println(min); 
		int max=b[0][k];
		for (int i=0;i<3;i++)
			{
				if (b[i][k] > max)
				{
					max=b[i][k];
				}
			}	
		System.out.println("Max no in the column: "+max);
//				
				
				
				

		
		// find the maximum no in the column in which smallest no is present
		
//		int[][] b = {{2,4,5},{3,4,7},{1,2,9}};
//		int min=b[0][0];
//		int max=0;
//		for (int i=0;i<3;i++)
//		{
//			for (int j=0;j<3;j++)
//			{
//				if (b[i][j] < min)
//				{
//					min=b[i][j];
//					int maxColumn=b[0][j];
//					for (int p=0;p<3;p++)
//					{
//						if (b[p][j] > maxColumn)
//						{
//							max=b[p][j];
//						}
//					}
//				} 
//			}
//		}
//		System.out.println("Minimum no in the matrix is "+ min); 
//		System.out.println("Max no in that column is "+ max);	
	}
}
