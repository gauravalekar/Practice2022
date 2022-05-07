package lambda_exmples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> animal = Arrays.asList("dog","cat","elephant","mouse");
		List<String> birds = Arrays.asList("peacock","parrot","crow","chiken");
		
		
		Stream <String> st1 = animal.stream();
		Stream <String> st2 = birds.stream();
		
		List<String> fl = Stream.concat(st1, st2).collect(Collectors.toList());
		
		System.out.println(fl);		

	}

}
