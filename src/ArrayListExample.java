import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>(); 
		
		a.add("rahul"); 
		a.add("menu");
		a.add(1,"java");  
		//System.out.println(a);
//		a.remove(0); a.remove("menu");
		System.out.println(a.get(0));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("java")); 
		System.out.println(a);
		Iterator<String> it=a.iterator();
		System.out.println(it.next());
		System.out.println(it.next().equals("java"));
		
//		 ArrayList<String> a =new ArrayList<String>();
//	        a.add("apple");
//	        a.add("banana");
//	        a.add("cherry");
//	        a.add("mango");
//	        a.add("apple");
//	        System.out.println(a);
//	        
//	        a.remove("apple");
//	        
//	        System.out.println(a);
//	        
//	        System.out.println("Orange found: "+a.contains("orange")); 
//	        
//	        System.out.println(a.size());
//	        
//	        for (int i=0;i<a.size();i++)
//	        {
//	            System.out.println(i+a.get(i));
//	        }
	}
}
