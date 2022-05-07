package lambda_exmples;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class em{
	String ename;
	int sal;


em(String ename, int sal){
	
	this.ename = ename;
	this.sal = sal;
}
}

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function <Integer, Integer> f1=n->n*2; 
		Function <Integer, Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));  // after  4  64
		System.out.println(f1.compose(f2).apply(2));  // before 8  16
		
		System.out.println("----------------------------");
		
		
		ArrayList <em> empls = new ArrayList<em>();
		
		empls.add(new em("david",50000));
		empls.add(new em("john",30000));
		empls.add(new em("mary",20000));
		
		
		Function<em, Integer> fn = e->{
									
							int sa = e.sal;
							
							if(sa >=10000 && sa <= 20000)
								return (sa *10/100);
							else if(sa >=20000 && sa <= 30000)
								return (sa *20/100);
							else if(sa >=30000 && sa <= 40000)
								return (sa *30/100);
							else 
								return (sa * 40/100);
				};
				
				Predicate<Integer> p = b->b>5000;
				
				for (em emp: empls  ) {
					
					int bonus = fn.apply(emp);
					
					if(p.test(bonus)) {
					
					System.out.println(emp.ename + "   "+emp.sal);
					System.out.println("Bonus is : " +bonus);
						}
				}
		
		
	}

}
