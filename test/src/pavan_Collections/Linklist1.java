package pavan_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		
		System.out.println(l);
		System.out.println("size: " +l.size());
		
		l.remove(3);
		System.out.println(l);
		
		l.add(2, 'T');  // adding to particular index
		System.out.println(l);  
		
		System.out.println("Respective index: " +l.get(3)); //retriving value
		
		for (Object o:l)
		{
			System.out.println(o);
		}
		
		Iterator it = l.iterator();
		while (it.hasNext())
		{
			System.out.println("IT : "+it.next());
		}
		
		

	}

}
