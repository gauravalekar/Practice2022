package pavan_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add("welcome");
		hs.add(222);
		hs.add('W');
		hs.add(4);
		hs.add(null);
		
		System.out.println(hs);  //insertion order not follow
		
		hs.remove(4);
		System.out.println(hs);
		
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains(47));
		
		System.out.println(hs.isEmpty());

		
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println();
		
		Iterator it = hs.iterator();
		
		while (it.hasNext())
		{	
			System.out.println(it.next());
		}
		
		
		
		HashSet en = new HashSet();
		en.add(2);
		en.add(4);
		en.add(6);
		
		System.out.println(en);
		
		HashSet en1 = new HashSet();
		
		en1.addAll(en);
		en1.add(8);
		System.out.println(en1);
		
		en1.remove(6);
		System.out.println(en1);
		
		
		
		HashSet set1 = new HashSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1);
		
		
		HashSet set2 = new HashSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);
		
		
		set1.addAll(set2); //union
		System.out.println("union : " +set1);
		
		
		set1.retainAll(set2);  // intersection
		System.out.println("intersection : " +set1);
		
		
		set1.removeAll(set2);  // difference
		System.out.println("difference : " +set1);
		
		
		
		
		
		
		
		
		
		

		
	}

}
