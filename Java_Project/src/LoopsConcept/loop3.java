package LoopsConcept;

public class loop3 {

	public static void main(String[] args) 
	{
		int x=10;
		
	/*	
		for(int i=0;i<=10;i++) 
		{
			 System.out.println(i+" "+x+" "+(x=x+i));
		}
		System.out.println(x);
		*/
		
		
		int sum=0;
		
		for(int j=0;j<=10;j++) 
		{
			sum=sum+j;
			System.out.println(j+" "+sum);
		}
		System.out.println(sum);
	}
}
