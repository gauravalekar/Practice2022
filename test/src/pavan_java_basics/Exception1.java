package pavan_java_basics;

// Exception - it is an abnormal event which terminate the program flow.
// 2 types = checked and unchecked
// checked - compile type exception, un-checked - run time
// un-checked - ArithmaticException, nullpointerException, numberformatexception, arrayindexoutofboundexception 
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
//		System.out.println(a/0); // arithmaticException
		
		String s=null;
		// System.out.println(s.length());  //NullPointerException
		
		String st = "dsfsd";
		//int i = Integer.parseInt(st);  //NumberFormatException
		//System.out.println(i);
		
		int arr[] = new int[5];
		arr[100]=10;  //ArrayIndexOutOfBoundsException
	}

}
