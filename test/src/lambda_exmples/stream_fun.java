package lambda_exmples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class stream_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> vl = Arrays.asList("bus","car","cycle","bike","car");
		
		List<String> dv = vl.stream().distinct().collect(Collectors.toList());  //distinct
		System.out.println(dv);
		
		long count = vl.stream().distinct().count();   //count
		System.out.println(count);
		
		List<String> lv = vl.stream().limit(2).collect(Collectors.toList());  //limit
		System.out.println(lv);
		
		
		//------------------------------------------------------------------------------------------------------
		
		List<Integer> nl = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long en = nl.stream().filter(num -> num%2==0).count();  //count
		System.out.println(en);
		
		Optional<Integer> min = nl.stream().min((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(min.get());
		
		
		Optional<Integer> max = nl.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());		
		
		
		//--------------------------------------------------------------------------------------------------------
		
		List<String> sl = Arrays.asList("A","B","C","1","2");
		
		Optional<String> reds = sl.stream().reduce((value, cv) ->
		{
			return cv;
		});
		System.out.println(reds.get());
		
		
		
	}

}
