package pavan_Collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add(100);
		lh.add('K');
		lh.add("yyy");
		lh.add(5.9);
		lh.add('K');
		
		System.out.println(lh);
		
		
		
		
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add('K');
		ll.add("yyy");
		ll.add(5.9);
		ll.add('K');

		
		System.out.println(ll);
		
		System.out.println(ll.element()); // return head element if not found then return NoSuchElementException error
		System.out.println(ll.peekFirst());  // return head element if not found then return NULL
		System.out.println(ll.peekLast()); // return last element if not found then return NULL
		
		
	}

}
