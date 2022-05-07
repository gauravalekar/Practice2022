package pavan_oops;



// Inheritance - Acquiring the methods and variables from parent class to child class is called inheritance.
// Types - single, multilevel, hierarchical,      multiple(not possible - use interface)
class P
{
	int a =10;
	int b=20;
	
	public void ad() {
		System.out.println(a+b);
	}
}

class Q extends P  // hierarchical inheritance
{
	int c = 10;
	int d = 20;
	
	public void mul() {
		System.out.println(c*d);
	}
}

class R extends P   // hierarchical inheritance
{
	int e = 50;
	int f = 10;
	
	public void su() {
		System.out.println(e-f);
	}
}

public class Inheri_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		R r = new R();
		r.ad();
		r.su();
		
		Q q = new Q();
		q.ad();
		q.mul();
		
	
		
		

	}

}
