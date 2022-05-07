package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FlatMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> l1 = Arrays.asList("ab","cd","ef");
		List <String> l2 = Arrays.asList("gh","ij","kl");
		List <String> l3 = Arrays.asList("mn","op","qr");
		
		List<List<String>> alphab = new ArrayList<List<String>>();
		alphab.add(l1);
		alphab.add(l2);
		alphab.add(l3);
		
		/*
		 * for (List<String> apl : alphab ) { for (String name : apl) {
		 * System.out.println(name); } }
		 */
		
		
		
		List <String> names = alphab.stream().flatMap(pl->pl.stream()).collect(Collectors.toList());
		System.out.println(names);
		
		
		

	}

}
