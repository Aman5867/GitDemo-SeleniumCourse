import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionInterviewQue {

	public static void main(String[] args) {
		
		int[] a = {4,5,5,5,4,6,6,9,4};
		
		//4- 3 , 5- 3 , 6 - 2 , 9 - 1
		
		ArrayList<Integer> ar=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if (!ar.contains(a[i]))
			{
				ar.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+" - "+k);
				if(k==1)
				{
					System.out.println(a[i]+" is the unique number");
				}
			}
		}
		
		
//		Map<Integer, Integer> h = new HashMap<>();   //chatgpt
//        
//        for (int num : a) {
//            h.put(num, h.getOrDefault(num, 0) + 1);
//        }
//        
//        // Print frequencies and identify unique numbers
//        
//        int count = 0;
//        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
//            count++;
//            String separator = (count == h.size()) ? "" : " , ";
//            System.out.print(entry.getKey() + " - " + entry.getValue() + separator);
//            
//            if (entry.getValue() == 1) {
//                System.out.println("\n" + entry.getKey() + " is the unique number in the array.");
//            }
//        }
		
		
//		HashMap<Integer,Integer> h=new HashMap<>(); //my original working way
//		
//		for (int i=0;i<a.length;i++)
//		{
//			if (h.containsKey(a[i]))
//			{
//				h.replace(a[i], h.get(a[i])+1);
//			}
//			else
//				h.put(a[i], 1);
//		}
//		
//		Set s=h.entrySet();
//		Iterator it=s.iterator();
//		
//		while(it.hasNext())
//		{
//			Map.Entry<Integer,Integer> m=(Map.Entry)it.next();
//			if (it.hasNext())
//			{
//				System.out.print(m.getKey()+" - "+m.getValue()+" , ");
//			}
//			else
//			{
//				System.out.print(m.getKey()+" - "+m.getValue());
//			}
//			if (m.getValue()==1)
//			{
//				System.out.println("\n"+m.getKey()+" is the unique no in the Array.");
//			}
//		}	
	}
}
