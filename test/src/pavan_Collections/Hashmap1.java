package pavan_Collections;

import java.util.HashMap;
import java.util.Map;

// Hashmap contains key and value. kay and value combinely called keypair
// EMPNAME Gaurav ---> Entryset
// EMPNAME, EMPNO --> key
// Gaurav, 7  --> values


public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "gaurav");
		hm.put(2, "abc");
		hm.put(3, "kiran");
		
		System.out.println(hm);
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		hm.remove(2);
		System.out.println(hm);
	}

}
