package lambda_exmples;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
		String ename;
		int salary;
		int experience;

		Employee(String name, int sal, int exp){
			ename = name;
			salary = sal;
			experience = exp;
		}
	}
	
	
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee emp = new Employee("gaurav", 20000, 10);
	
	//Predicate<Employee> pr = e->(e.salary>10000 && e.experience>7);
	
	//System.out.println(pr.test(emp));
	
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	al.add(new Employee("eee", 5000, 4));
	al.add(new Employee("qqq", 75000, 8));
	al.add(new Employee("uuu", 15000, 5));
	
	for(Employee e : al) {
		
		if(e.salary>12000 && e.experience > 3 ) {
			System.out.println(e.ename+ " "+e.salary);
		}
	}
	
	// ---------------------------------------------------------------------------------------------------------------
	
	int a[] = {5,15,20,25,30,35,40,60,65,70,75,80};
	
	Predicate <Integer> p1=i->i%2==0;
	Predicate <Integer> p2=i->i>50;
	
	for(int n:a) {
		if(p1.and(p2).test(n))   //AND
		{
			System.out.println(n);
		}
	}
	
	System.out.println("--------------------------------");
	
	for(int n:a) {
		if(p1.or(p2).test(n))   //OR
		{
			System.out.println(n);
		}
	}

	}

}
