package pavan_java_basics;

public class String_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcome";
		
		//Length - number of characters in the string. Return length of string
		System.out.println(s.length());
		
		//Equal  - compare the string    Equalignore - ignore case sensitivity 
		String s1= "OK";
		String s2="ok";
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		
		//contains - check the string contains another string
		System.out.println(s.contains("w"));
		System.out.println(s.contentEquals("welcome"));
		System.out.println(s.contentEquals("welcom"));
		
		//Substring - extracting substring contains another string
		System.out.println(s.substring(0, 2)); //we                   0 1 2 3 4 5 6 --->starting index    
		System.out.println(s.substring(1, 4)); //elc                  W E L C O M E
		System.out.println(s.substring(2, 5)); //lco                  1 2 3 4 5 6 7 --->ending index     
		
		
		//Concatenation - join the string
		String s3="gau";
		String s4="rav";
		System.out.println(s3.concat(s4));
		System.out.println(s3+s4);
		System.out.println("gau"+"rav");
		
		//replace = replacing characters within string
		String s5="name";
		System.out.println(s5.replace('m', 'j'));
	}

}
