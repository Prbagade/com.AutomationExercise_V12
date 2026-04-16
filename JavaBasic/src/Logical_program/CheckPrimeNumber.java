package Logical_program;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		check the prime number
		
		int num =3;
		int count =0;
		
//		System.out.println("Enter your Number...");
//		
//		//scanner class
//		Scanner sc = new Scanner(System.in);
//		num=sc.nextInt();
//		
		for(int i=1; i<=num;i++) 
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if(count==2) 
		{
			System.out.println("Prime Number "+num);
			
		}
		else 
		{
			System.out.println("Not a Prime Number "+num);
		}
		
	}

}
