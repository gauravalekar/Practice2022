package pavan_Collections;

import java.util.PriorityQueue;

public class queqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue();  //FIFO
		
		
		  pq.add("m"); pq.add("C"); pq.add("B"); pq.add("B");
		 
		System.out.println(pq); // Insertion order follow and duplicate allow
		
		System.out.println(pq.element()); //return head element, if empty return NoSuchElementException
		System.out.println(pq.peek()); //return head element, if empty return null
		
		//pq.remove();  //A
		//System.out.println(pq);
		
		//pq.poll();  //A
		//System.out.println(pq);
	}

}
