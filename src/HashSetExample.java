import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO 

		//HashSet,TreeSet, LinkedHashSet implements set interface
		//does not accept duplicate values
		//no guarantee that elements are stored in sequential order...it might be Random order
		
		HashSet<String> h=new HashSet<String>();
		h.add("USA");
		h.add("UK");
		h.add("INDIA"); h.add("Japan");
		h.add("INDIA");
		System.out.println(h); 
		//h.remove("UK");
		//System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		String a=it.next();
//		System.out.println(a);
		
		
	}

}
