package Java_Logical_Program;

public class SwapNumber {

	
	public static void main(String[] args) {
	
//		swappinig two number
		
		int a=10, b=20;
		
		int temp=0; //third variable
		
		System.out.println("Before swapping "+"a = "+a+" "+"b = "+b);
		
		//logic 1 --> using third variable
	
		/*	temp=a; // temp = 10
		a=b;	// a = 20
		b=temp; // b = 10
		*/
		
		//logic 2 --> using without third variable (+,-)
		
		/*
		a=a+b; //10+20 =30
		b=a-b; //30-20 =10
		a=a-b; //30-10 =20
		*/
		
		//logic 3 --> using without third variable (*,/)
		
		/*
		a=a*b; //10*20 =200
		b=a/b; //200/20 =10
		a=a/b; //200/10 =20
		*/
		
		//logic 4 --> Single statement
		
//		b=a+b-(a=b);
		
		//logic 5 --> bitwise XOR

		a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20
		
	
		System.out.println("After swapping "+"a = "+a+" "+"b = "+b);

	}

}
