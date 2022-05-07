package pavan_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linklist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.add('X');
		ll.add('A');
		ll.add('C');
		ll.add('B');
		
		LinkedList lll = new LinkedList();
		lll.addAll(ll);
		System.out.println(lll);
		
	//	lll.removeAll(ll);
	//	System.out.println(lll);
		
		System.out.println("Before sorting: "+lll);
		Collections.sort(lll);
		System.out.println("After sorting: "+lll);
		
		Collections.sort(lll, Collections.reverseOrder());
		System.out.println("Reverse order: "+lll);
		
		lll.addFirst("first");
		lll.addLast("last");
		
		System.out.println (lll.getFirst());
		System.out.println (lll.getLast());
	}
}