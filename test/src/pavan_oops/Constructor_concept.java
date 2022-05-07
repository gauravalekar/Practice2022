package pavan_oops;

public class Constructor_concept {

	// Constructor is a special kind of method. Constructor name should be same as class name
	// Constructor not return any value
	// Constructor will be invoke at the time of object creation.(we will not call constructor explicitly)
	// Constructor will takes parameter just like method.
	// Constructor is use to initialize the value
	// Types --> default constructor, parameterized constructor
	
	int a=0;
	int b=0;
	double c=0;
	
	Constructor_concept(){
		a=10;
		b=20;
	}
	
	Constructor_concept(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	Constructor_concept(int x, double y){
		a=x;
		c=y;
	}
	
	Constructor_concept(int x,int y, double z){
		a=x;
		b=y;
		c=z;
	}
	
	void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
	//	Constructor_concept co = new Constructor_concept();
	//	Constructor_concept co = new Constructor_concept(3,4);
	//	Constructor_concept co = new Constructor_concept(3,4.7);
	//	Constructor_concept co = new Constructor_concept(3,2,4.7);
	//	co.display();
		

	}

}
