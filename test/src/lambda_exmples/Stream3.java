package lambda_exmples;

import java.util.ArrayList;
import java.util.List;

class product{
	
	int id;
	String name;
	double price;
	

	product(int id,String name, double price){
	
		this.id = id;
		this.name = name;
		this.price = price;		
	}	
}



public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<product> pl = new ArrayList<product>();
		
		pl.add(new product(1,"rice",51.34));
		pl.add(new product(2,"dal",60.11));
		pl.add(new product(3,"oil",70.78));
		pl.add(new product(4,"masala",40));
		
		
		pl.stream()
			.filter(p->p.price > 50)
			.forEach(pr->System.out.println(pr.price+ " "+pr.name + " "+pr.id));
		

	}

}
