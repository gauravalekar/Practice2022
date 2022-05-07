package pavan_java_basics;


// checked exception - IntrruptedException, FilenotfoundException, IOException
// 2 types - try... catch block (for checked and unchecked), throws keywords (checked)

public class Exception3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		
		try {
			Thread.sleep(4000);  // InterruptedException
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.println("end");
		
		
		Thread.sleep(2000);

	}

}
