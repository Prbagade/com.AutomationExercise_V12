package LoopsConcept;

public class StartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		//Sqare or rectangle
	/*	for(int i=0;i<num;i++) //rows
		{
			for(int j=0;j<num;j++) //column
			{
			System.out.print(" * ");
			}
			System.out.println();
		}
		*/
		
		// Increasing triangle
	/*	for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" # ");
			}
			System.out.println();
		}
		*/
		
		// Decreasing triangle
	/*	for(int i=1;i<=num;i++) 
		{
			for(int j=i;j<=num;j++) 
			{
				System.out.print(" # ");
			}
			System.out.println();
		}
		*/
		
 		//Right side triangle
/*		for(int i=1;i<=num;i++) 
		{
			for(int j=i;j<=num;j++) 
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		*/
		
 		//Right side triangle
	/*	for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("  ");
			}
			for(int k=i;k<=num;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		} */
		
 		//Right Hill triangle
	/*	for(int i=1;i<=num;i++) 
		{
			for(int j=i;j<=num;j++) 
			{
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) 
			{
				System.out.print("* ");
			}
			for(int s=1;s<=i;s++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}	*/
		
		// Reverse Hill
	/*	for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("  ");
			}
			for(int k=i;k<num;k++) 
			{
				System.out.print("* ");
			}
			for(int s=i;s<=num;s++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// Diamond 
		for(int i=1;i<num;i++) 
		{
			for(int j=i;j<=num;j++) 
			{
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) 
			{
				System.out.print("* ");
			}
			for(int s=1;s<=i;s++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		
		// Reverse Hill
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("  ");
			}
			for(int k=i;k<num;k++) 
			{
				System.out.print("* ");
			}
			for(int s=i;s<=num;s++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
