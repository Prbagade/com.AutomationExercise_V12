package Java_Logical_Program;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial of 5!
		
//		5*(5-1)*(5-2)*(5-3)*(5-4) = 120 
//		5*4*3*2*1 = 120 
		
		int fact =5;
		
		for(int i=1;i<5;i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+fact);

	}

}
