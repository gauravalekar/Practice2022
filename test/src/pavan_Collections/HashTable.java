package pavan_Collections;

import java.util.Hashtable;
import java.util.Map;

// HashTable  = Synchronized. One thread allow at time. thread safe. low performance
// HashMap = non-synchronized. multi threading allow. not thread safe. high performance.


public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String> ();
		
		ht.put(1, "ppp");
		ht.put(2, "qqq");
		ht.put(3, "rrr");
		
		//ht.put(null,"tt");   //nullpointerexception
 		//ht.put(2,null);      //nullpointerexception
		
		System.out.println(ht);
		
		System.out.println(ht.get(1));
		
		ht.remove(2);
		System.out.println(ht);
		
		System.out.println(ht.containsKey(1));
		System.out.println(ht.containsKey(2));
		
		System.out.println(ht.containsValue("ppp"));
		System.out.println(ht.containsValue("wrwer"));
		
		System.out.println(ht.isEmpty());
		
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		System.out.println("-----------------------------");
		
		for(int i : ht.keySet()) {
			System.out.println(i +" "+ht.get(i));
		}
		
		System.out.println("-----------------------------");
		
		
		for(Map.Entry entry : ht.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	

	}

}
