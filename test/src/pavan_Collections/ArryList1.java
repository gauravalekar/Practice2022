package pavan_Collections;

import java.util.ArrayList;

// ArrayList is a data structure in java. ArrayList has not limit. We can store any any kind of data type elements.
// int a[] = new int[5] - normal array declaration
// ArrayList al = new ArrayList(); - Allow all data types elements
// ArrayList<String> al = new ArrayList<String>(); - allows only string type data elements
//ArrayList<integer> al = new ArrayList<integer>(); - allows only integer type data elements

//a1.add() -> adding elements into array list
//a1.size() -> return number of elements
//a1.(2,"value") -> inserting value in the middle
// a1.remove(value) -> remove elements
// a1.remove(index) -> after number of elements


public class ArryList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		System.out.println("number of elements " +al.size());
		
		al.add("welcome");
		al.add(2);
		al.add('G');
		
		System.out.println("number of elements " +al.size());
		
		System.out.println("elements in arraylist " +al);
		
		al.add(7);		
		al.add(2, "aaa");
		System.out.println("elements in arraylist " +al);
		
		al.add(3, "bbb");
		System.out.println("elements in arraylist " +al);
		
		al.remove(1);
		System.out.println("elements in arraylist " +al);
		
		al.remove("welcome");
		System.out.println("elements in arraylist " +al);

	}

}




















