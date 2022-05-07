package pavan_java_basics;

public class Arr_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array with different data types	
	Object o[] = new Object[3];
	o[0]=1;
	o[1]=5.2;
	o[2]='G';
	
	for (Object e:o) {
		System.out.println(e);
	}
	
		
	Object q[] = {3,4,1.5,"gaurav",'T'};
	for(Object w:q) {
		System.out.print(w+ ","+ " ");
	}

	}

}
