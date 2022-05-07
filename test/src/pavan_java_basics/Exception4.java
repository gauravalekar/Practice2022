package pavan_java_basics;

import java.io.IOException;


public class Exception4 {

	void method()throws IOException{
		
		  System.out.println("device operation performed");  
		 }  
		  
		


		  
		   public static void main(String args[])throws IOException{//declare exception  
			Exception4 m=new Exception4();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
	
	}

}
