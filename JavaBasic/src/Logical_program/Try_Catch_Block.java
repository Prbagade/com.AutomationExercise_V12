package Logical_program;

public class Try_Catch_Block {

	
	public static void main(String[] args) {
		
		int x=10;
		int z= 5;
		int y=0;
		
		System.out.println(10/5);
		
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(10/10);
		}
		
		
		
	}
}
