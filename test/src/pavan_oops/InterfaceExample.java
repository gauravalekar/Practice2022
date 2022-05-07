package pavan_oops;

// Interface is blueprint of class
interface test
{
int a=10;     // By default variables are static and final 
void meth1(); // default abstract method - only declaration no implementation,  interface default methods are public
}




public class InterfaceExample implements test{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("implemanting interface - abstract method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//  test ts = new test(); // Cannot instantiate the type test - invalid
		InterfaceExample ie = new InterfaceExample();
		ie.meth1();
		
	}

	

}
