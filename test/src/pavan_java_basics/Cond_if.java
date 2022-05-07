package pavan_java_basics;

public class Cond_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=5;
		if (d==1)
		{
		System.out.println("monday");
		}
		else if(d==2) {
			System.out.println("Tuesday");
		}
		else if(d==3) {
			System.out.println("wednesday");
	}
		else if(d==4) {
			System.out.println("Thursday");
	}
		else if(d==5) {
			System.out.println("Friday");
	}
		else if(d==6) {
			System.out.println("Saturday");
	}
		else {
			System.out.println("Sunday");
		}
		
		
		
		int p=1000;
		int q=200;
		int r=300;
		
		if((p>q) && (p>r)) {
			System.out.println("P is greater");
		}
		else if((q>p) && (q>r)) {
			System.out.println("Q is greater");
		}
		else{
			System.out.println("R is greater");
		}
		
	}
}
