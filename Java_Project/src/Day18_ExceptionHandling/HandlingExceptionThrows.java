package Day18_ExceptionHandling;

import java.util.Scanner;

public class HandlingExceptionThrows 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		
		
		System.out.println(10/num);
		
		// Aproach 1
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		//Aproach 2
		
		Thread.sleep(3000);
		
		
			System.out.println("Program is completed...");
		
		
		System.out.println("Program is exited...");
		
	}

}
