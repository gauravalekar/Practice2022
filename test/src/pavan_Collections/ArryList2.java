package pavan_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add('G');
		al.add('Y');
		al.add("ket");
		
		for (Object a:al)
		{
			System.out.println(a);
		}
		
		System.out.println(al);
		
		al.add(2,'K');
		System.out.println(al);
		
		System.out.println("Specific index: " +al.get(1));
		
		
		
		System.out.println("Size : " +al.size());
		
		al.set(0, 'H');
		System.out.println("replacing :" +al);
		
		System.out.println(al.contains('G'));

		System.out.println(al.isEmpty());
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
