package Day3;

public class twoDiamentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Two Diamentional array
		
		//Approach 1
	/*	int a[][] = new int [3][2]; //3 row & 2 column
//		int [][]a = new int [3][2];  // correct
//		int a[][] = new int [3][2];  // correct
	
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		System.out.println(a.length);
		*/
		
		//Approach 2
		int b[][] = {{100,200},{300,400},{500,600}};
		
		System.out.println("no of rows ="+b.length);
		System.out.println("no of column ="+b[0].length);
		
		System.out.println(b[2][0]);
		
		//normal for loop
			for(int i=0; i<=2;i++) 
		{
			for(int c=0;c<=1 ;c++) 
			{
				System.out.print(b[i][c]+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
