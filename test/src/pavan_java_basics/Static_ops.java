package pavan_java_basics;

// static methods and variables are shared across all the objects
// static methods and variables can directly access through class name
// static methods can also access non static stuff but through object
// non-static methods can access everything (static and non-static)

public class Static_ops {
	
	int a=10;
	static int b=20;
	static int c =30;

	void nonST() {
		System.out.println("this is non staic method");
		System.out.println("non-staic access both types of variables: "+a+" "+b);	
	}
	
	static void st() {
		System.out.println("this is static method");
	//	System.out.println("non-static access both types of variables: "+a+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Static method can access Static stuff only
		System.out.println(b);
		System.out.println(Static_ops.c);
		st();		
		
		//System.out.println(a);   not accessible because it is static variable
		//nonST();                 not accessible because it is static method   
				
		Static_ops ns = new Static_ops();
		System.out.println(ns.a);
		ns.nonST();
		
	}
}