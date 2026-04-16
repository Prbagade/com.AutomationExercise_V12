package Day18_ExceptionHandling;

import java.util.Scanner;

public class HandlingExceptionFinally 
{
	public static void main(String[] args)
	{
System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		
		try {
		System.out.println(10/num);
		}
		catch(Exception e) // for handling any type of exception (its Superclass of all exception)
		{
			System.out.println(e.getMessage());
		
		}
		finally 
		{
			System.out.println("Program is completed...");
		}
		
		System.out.println("Program is exited...");
		
	}

}
