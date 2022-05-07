package pavan_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Insertion order not followed. Duplicate keys are not allowed. Duplicate values are allowed.
// null key allow once, duplicate values are allow multiple times.
// key - value pair


public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "gaurav");
		hm.put(102, "john");
		hm.put(103, "tim");
		hm.put(104, null);
		hm.put(null, "gaurav");
		hm.put(null, "pp");
		hm.put(105, null);
		hm.put(106, "tushar");
		
		System.out.println(hm.get(102));
		System.out.println(hm);
		
		
		hm.remove(104);
		System.out.println(hm);
		
		
		System.out.println(hm.containsKey(102)); //true
		System.out.println(hm.containsKey(109)); //false
		
		System.out.println(hm.isEmpty()); //false

		System.out.println(hm.keySet()); // [null, 101, 102, 103, 105, 106]
		System.out.println(hm.values()); // [pp, gaurav, john, tim, null, tushar]
		System.out.println(hm.entrySet()); //[null=pp, 101=gaurav, 102=john, 103=tim, 105=null, 106=tushar]
		
		
		/*for(Object i : hm.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		for(Object i : hm.values()) {
			System.out.println(i);
		}*/
		
		System.out.println("-------------------");
		
		for(Map.Entry entry: hm.entrySet())
		{
			System.out.println(entry.getKey() + "  "+ entry.getValue());
		}
		
		System.out.println("-------------------");
		
		Set s = hm.entrySet();		
		Iterator it = s.iterator();		
		while (it.hasNext()) {			
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + "  "+ entry.getValue());
				
		}
		
		
	}

}
