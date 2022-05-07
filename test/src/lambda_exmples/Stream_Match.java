package lambda_exmples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Stream_Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("two apples");
		fruits.add("two mangoes");
		fruits.add("more mangoes");
		
		// Any Match
		
		boolean r = fruits.stream().anyMatch(v->{return v.startsWith("one");});
		System.out.println(r);  // true
		
		// allMatch
		boolean al = fruits.stream().allMatch(v1->{return v1.startsWith("one");});
		System.out.println(al);  // false
		
		// NonMatch
		boolean nal = fruits.stream().noneMatch(v2->{return v2.startsWith("one");});
		System.out.println(nal);  // false
		

		// FindAny()
		
		List<String> sl = Arrays.asList("one","two","three","one");
		
		Optional<String> ele = sl.stream().findAny();
		System.out.println(ele.get());
		
		Optional<String> elefi = sl.stream().findFirst();
		System.out.println(elefi.get());			
				
	}
}
