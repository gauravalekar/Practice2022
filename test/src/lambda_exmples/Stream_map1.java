package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> num = Arrays.asList(2,3,4,5);
		List<Integer> multiplenum = new ArrayList<Integer>();
		
		// before java 8
		for(int num1: num) {
	//		System.out.println(num1*3);
			multiplenum.add(num1*3);
		}
		System.out.println(multiplenum);
		
		
		
		

	}

}
