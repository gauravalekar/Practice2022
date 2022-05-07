package lambda_exmples;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		
		Function<Integer, Integer> f = n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		
		Function<String, Integer> fn = s->s.length();
		System.out.println(fn.apply("welcome"));
		System.out.println(fn.apply("welcome dsdfdewrwr rwee"));
		
		
		

	}

}
