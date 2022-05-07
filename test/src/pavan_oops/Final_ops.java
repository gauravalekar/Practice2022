package pavan_oops;


class fin {
	
	final int f = 10;
	
	final void m1() {
		// f=20;  // value which is define as final cannot be change
		System.out.println("hello");
	}
	
	void m1(int x, int y) { }  // method overloading is possible for final method
}

final class abc { // Final class cannot be extended
	
	void m2() { System.out.println("hi");}
}

class fin2 extends fin{
	
	// void m1() { } //method overriding not possible for final method
	
}


public class Final_ops {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fin fn = new fin();
		System.out.println(fn.f);
		fn.m1();
	}
}
