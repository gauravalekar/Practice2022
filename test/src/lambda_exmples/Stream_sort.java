package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> li1 = Arrays.asList(2,4,1,3,7,5,9);
		List <Integer> li2 = li1.stream().sorted().collect(Collectors.toList());
		System.out.println(li2);                  // Ascending order
		
		List<Integer> revlis = li1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(revlis);             // Reverse order
		
		
		// String
		
		List <String> lis1 = Arrays.asList("gau", "yami", "ket");
		List <String> lis2 = lis1.stream().sorted().collect(Collectors.toList());
		System.out.println(lis2); 
		
		List<String> revlisS = lis1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(revlisS);
		
		
		
		

	}

}
