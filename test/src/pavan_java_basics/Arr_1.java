package pavan_java_basics;

public class Arr_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Array is a collection of slimier data type
		
		// Fix length Array
		int a[] = new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=8;
		a[3]=6;
		
		for(int i=0;i<4;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		//Dynamic length array and for each loop
		
		int b[]= {3,4,6,7,9,0,1,2,5};
		
		for(int j: b)
		{
			System.out.print(j+" ");
		}

		
	}

}
