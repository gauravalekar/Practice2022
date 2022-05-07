package pavan_oops;


// Overriding - Re-define the same method from parent class into child class
// at least we should have 2 classes. Definition should be same. but body can be change


class bank{
	
	int getroi() {
		return 1;   //definition
	}
}

class icici extends bank{
	
	int a =10;
	int getroi() {
		return 4;
	}
}

class axis extends icici{
	
	int getroi() {
		return 7;
	}
}



public class Method_overriden1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		icici ic = new icici();
		System.out.println(ic.getroi());
		
		
		axis ax = new axis();
		System.out.println(ax.getroi());
		System.out.println(ax.a);
		
		
		
		

	}

}
