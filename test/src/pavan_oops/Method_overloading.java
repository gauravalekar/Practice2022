package pavan_oops;

public class Method_overloading {

	
	// A class contains more than one method with same name is called as method overloading
	// It is divide like - number of parameters, order of parameters, data types of parameters
	
	int a;
	int b;
	
	void sum() 
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int a, int b) 
	{
		this.a=b;   // this keyword is used to assign the same variable name as class variable name
		this.b=b;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) 
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x, int y, double z) 
	{
		System.out.println(x+y+z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_overloading mo = new Method_overloading();
		mo.sum();
		mo.sum(30,40);
		mo.sum(30,40,10);
		mo.sum(30,40,10.5);
	}

}
