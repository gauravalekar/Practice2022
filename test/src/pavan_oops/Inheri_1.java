package pavan_oops;



// Inheritance - Acquiring the methods and variables from parent class to child class is called inheritance.

class A
{
	int a =10;
	int b=20;
	
	public void ad() {
		System.out.println(a+b);
	}
}

class B extends A  // till here single inheritance
{
	int c = 10;
	int d = 20;
	
	public void mul() {
		System.out.println(c*d);
	}
}

class C extends B   // till here multilevel inheritance
{
	int e = 50;
	int f = 10;
	
	public void su() {
		System.out.println(e-f);
	}
}

public class Inheri_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C b = new C();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
		b.ad();
		b.mul();
		b.su();
		
		
	
		
		

	}

}
