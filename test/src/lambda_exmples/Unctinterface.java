package lambda_exmples;


interface Cab
{
	public String bookCab(String source, String destination);
}

public class Unctinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cab cab=(String source, String destination)->{
			System.out.println("Ola cab is booked from .. "+source+" TO  "+ destination);
			return ("Price 5000 ");
		};
		System.out.println(cab.bookCab("Pune", "Mumbai"));
	}
}
