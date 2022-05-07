package pavan_oops;

class vehicle{
	
	void run() {
		System.out.println("All vehicles are running");
	}
}

class bike extends vehicle{
	
	void run() {
		System.out.println("Bikes are running");
	}
}

class bus extends bike{
	
	void run() {
		System.out.println("Buses are running");
	}
}


public class Method_overriden_vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle vv = new vehicle();
		vv.run();
		
		
		bike bk = new bike();
		bk.run();
		
		bus bs = new bus();
		bs.run();

	}

}
