package LoopsConcept;

public class FactorialProgram {

	public static void main(String[] args) 
	{
		int num=5;
		
	/*	for(int i=1;i<5;i++) 
		{
			num=num*i; // factorial 1*2*3*4*5 =120
		}
		System.out.println("Factorial of 5 = "+num); //120
	*/
		int fact=1;
		
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
