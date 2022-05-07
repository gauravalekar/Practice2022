package pavan_Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArryList3 {

	public static void main(String[] args) {

		ArrayList al3 = new ArrayList();
		
		al3.add("a");
		al3.add("b");
		al3.add("t");
		al3.add("c");
		
		System.out.println(al3);
		
		Collections.sort(al3);
		System.out.println("After sort : " +al3);
		
		Collections.sort(al3,Collections.reverseOrder());
		System.out.println("Reverse order : " +al3);
		
		Collections.shuffle(al3);
		System.out.println("After shuffle : " +al3);
		
		ArrayList al4 = new ArrayList();
		al4.addAll(al3);
		System.out.println("copy to other list: " +al4);
	
	
	String b[]= {"sq", "ww", "ty"};
	
	for(String j: b)
	{
		System.out.print(j+" ");
	}
	System.out.println();
	ArrayList al5 = new ArrayList(Arrays.asList(b));
	System.out.println(al5);
	

	}	
	
}
