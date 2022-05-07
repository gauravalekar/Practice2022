package pavan_oops;

public class Method_Parameter {

	
	int a;
	int b;
	
	//1. Method not taking any parameter
	void sum() {
		System.out.println(a+b);
	}
	
	
	// Method with parameter
	void multi(int x, int y) 
	{
		a=x;
		b=y;
		System.out.println(a*b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Parameter mp = new Method_Parameter();
		mp.a=10;
		mp.b=40;
		mp.sum();
		
		mp.multi(2, 8);
	}

}
