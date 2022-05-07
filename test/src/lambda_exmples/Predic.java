package lambda_exmples;

import java.util.function.Predicate;

// Predicate - one parameter, return boolean 
// use only if you have conditional checks

public class Predic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ex1
		
		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20)); // true
		System.out.println(p.test(2));  // false

		
		// Ex2  - Check length of string is greater than 4 or not
		
		Predicate <String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("welcome"));
		System.out.println(pr.test("789"));
		
		
		// Ex 3  - print array element whose size is > 4 in array
		
		String names[] = {"david","scott","john","car"};
		
		for (String name: names) {
			{
				if(pr.test(name))
				{
					System.out.println(name);
				}
			}
		}						
	}
}
