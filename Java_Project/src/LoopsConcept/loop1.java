package LoopsConcept;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 table or any 
		int n=5;
		
//		for(int i=1;i<=10;i++) 
//		{
//			System.out.println(n+"*"+i+" ="+i*n);
//		}
		
		int sum=0;
		
		for(int i=1;i<=n;i++) 
		{
			sum=sum+i*2;
		}
		System.out.println("Sum of n = "+sum);
		System.out.println("Sum of Even no. = "+sum);
	}
	
}
