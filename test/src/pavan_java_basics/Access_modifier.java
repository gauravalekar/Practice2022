package pavan_java_basics;

class pub{
	
	public int w=10;          //public
	public void m() 	      //public	 - can be access everywhere
	{     
		System.out.println("public");
	}
	
	int x=20;               //default  - access only within package
	void mm()              //default
	{
		System.out.println("default");
	}
	
	protected int y = 30;     // protected - access within package and outside package but thru inheritance
	protected void mmm()     // protected 
	{
		System.out.println("protected");
	}
	
	private int z=10;    // private - private can access only specific to class. Only within class 
	private void mmmm()  // private
	{
		System.out.println("hi...");
	}
	
	
	
}


public class Access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pub pb = new pub ();
		
		System.out.println(pb.w);
		pb.m();
		
		System.out.println(pb.x);
		pb.mm();
		
		System.out.println(pb.y);
		pb.mmm();
		
	//	System.out.println(pb.z);    
	//	pb.mmmm;
	}

}
