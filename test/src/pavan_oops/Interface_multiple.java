package pavan_oops;

interface aa{
	int a=10;
	void display();
}

interface bb{
	int b=10;
	void display1();
}

public class Interface_multiple implements aa,bb {


	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("display1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_multiple im = new Interface_multiple();
		im.display();
		im.display1();
		
	}
}
