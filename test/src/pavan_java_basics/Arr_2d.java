package pavan_java_basics;

public class Arr_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fix length
		int a[][] = new int [3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		for(int i=0;i<=2;i++)  //increase rows
		{
			for (int j=0;j<=1;j++)  //increase columns
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		// dynamic length
		int b[][] = {{1,2,3},{4,5,6,11},{7,8,9}};
		for(int x[]:b) {
			for(int y:x) {
				System.out.print(y+" ");				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
