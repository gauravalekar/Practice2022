package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> number = Arrays.asList(10,15,20,25,30);
		List <Integer> ev = new ArrayList<Integer>();
		
		//without using stream
		
		for (int n: number) {
			if(n%2==0) 
				ev.add(n);
		}
		System.out.println(ev);

		// with stream
		
		ev = number.stream().filter(m->m%2==0).collect(Collectors.toList());
		System.out.println(ev);
	}

}
