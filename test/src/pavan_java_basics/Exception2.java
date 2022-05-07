package pavan_java_basics;

// try { specify the code which cause exception } 
// catch(Exception type) { write the code}
// finally - exception occurs catch block handles, finally block executed.  exception occurs catch block not handles, finally block executed
// exception not occurs catch block ignore, finally block executed

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program started");
		
		int a =10;
		try {
		System.out.println(a/0); // arithmaticException
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program in progress");		
		System.out.println("program terminated");
		
		
		
		
		
		String s=null;
		try {
		System.out.println(s.length());  //NullPointerException
		}
		catch(NullPointerException e) {
			System.out.println("handle");
		}
		
		
		String st = "dsfsd";
		try {
		int i = Integer.parseInt(st);  //NumberFormatException
		System.out.println(i);
		}
		catch(NumberFormatException e) {}
		finally
		{System.out.println("expection occur catch block present and final block executed");}
		
		
		
		  try
		  { 
			  int arr[] = new int[5]; 
			  arr[100]=10; //ArrayIndexOutOfBoundsException }
		  }
		  finally {
			  System.out.println("expection occur catch block not present and final block executed");}
		 
		
		
		try {
			int arr1[] = new int[5];
			arr1[2]=10;  //ArrayIndexOutOfBoundsException
			}
		catch (ArrayIndexOutOfBoundsException e) {}
			finally {System.out.println("expection not occur catch block not present and final block executed");}
		
		
		
	}

}
