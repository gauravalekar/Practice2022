package pavan_oops;

public class Basic_class {


	// Class is a collection of variables and methods.
	// object is a instance of a class (physical)
	// Method is a piece of a code which perform certain task
	// Method should be part of a class
	
	//Ways to initialize the values to class variable ---> using object, using constructor, using method
	
	int empid;
	String name;
	int deptid;
	
	
	void display()  // method
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(deptid);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic_class cl = new Basic_class();  //Basic_class ---> class name, cl ---> reference variable of object, Basic_class()---> Instantiation, new()-->keyword
		cl.empid=101;
		cl.name="john";
		cl.deptid=7;
		cl.display();
// Instantiate in Java means to call a constructor of a Class which creates an an instance or object, of the type of that Class. Instantiation allocates the initial memory for the object and returns a reference.
	}

}
