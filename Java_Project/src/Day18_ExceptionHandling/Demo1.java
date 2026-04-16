package Day18_ExceptionHandling;

import java.util.Scanner;

public class Demo1 {

	/* Exception is event which will cause program termination.
	 *  Errors --> 1. sytax error & 2. Logical error 
	 * 
	 * Type of Exception
	 * 
	 * 1) Checked Exceptions
	 * 		- The exceptions which are identified by java compiler 
	 * 		ex - InteruptedException
 * 			   - FileNotFoundException
 * 			   - IOException etc...
 * 		
 * 	   2) Unchecked Exception
 * 			- The Exception which are not identified by java compiler.
 * 			ex - ArithmaticException
 * 			   - NullPointerException
 * 			   - ArrayIndexOutOfBoundException etc...   
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		
		System.out.println(10/num);
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");

	}

}
