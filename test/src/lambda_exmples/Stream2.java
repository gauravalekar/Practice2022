package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print  the name which is greater than 5 and less than 8

		List <String> name = Arrays.asList("gaurav", "ketaki","yaaami","ok", "welcomeeeeeee");
		
		List <String> longername = new ArrayList<String>();
		
		longername = name.stream().filter(str->str.length() > 5 && str.length() < 8 ).collect(Collectors.toList());
		System.out.println(longername);
		
		name.stream().filter(str->str.length() > 5 && str.length() < 8 ).forEach(str->System.out.println(str));
		
		
		
		// Remove the null character from list and then print
		
		List <String> words = Arrays.asList("gaurav", "ketaki","yaaami",null, "welcomeeeeeee");	
		List <String> result = words.stream().filter(w-> w!=null).collect(Collectors.toList());
		System.out.println(result);
		
		
		
		
		
	}

}
