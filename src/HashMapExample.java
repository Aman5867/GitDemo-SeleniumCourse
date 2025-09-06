import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<>();
		//Hashtable<String, Integer> hm=new Hashtable<>();
		hm.put("aam", 6); 
		hm.put("kela", 12); 
		hm.put("lichi", null);
		//System.out.println(hm);
		
//		System.out.println(hm.get("lichi"));
//		hm.remove("lichi");
//		System.out.println(hm.get("lichi"));
//		hm.forEach((key, value) -> {
//		    System.out.println("Key: " + key + ", Value: " + value);
//		});
		Set e = hm.entrySet();
		
		Iterator it = e.iterator(); 
		
		while(it.hasNext())
		{
			Map.Entry s=(Map.Entry)it.next();
	
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
//		for(Map.Entry<String, Integer> entry : hm.entrySet() )
//
//		{
//
//		System.out.println(entry.getKey());
//
//		System.out.println(entry.getValue());
//
//		}

	}

}
