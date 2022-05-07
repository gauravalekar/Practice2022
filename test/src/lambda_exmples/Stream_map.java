package lambda_exmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> vehicles = Arrays.asList("bus","train", "car","scooter");
		List <String> vehiclesuppercase = new ArrayList<String>();
		List <Integer> vehicleslen = new ArrayList<Integer>();
		
		// before using stream
		//for(String name: vehicles) {
		//	vehiclesuppercase.add(name.toUpperCase());
	//	}
//		System.out.println(vehiclesuppercase);

		
		vehiclesuppercase = vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());   // To upper case
		System.out.println(vehiclesuppercase);
		
		vehicleslen = vehicles.stream().map(l->l.length()).collect(Collectors.toList());   // Find length
		System.out.println(vehicleslen);
		
		
		//vehicles.stream().map(l->l.length()).forEach(len->System.out.println(len));
	}

}
