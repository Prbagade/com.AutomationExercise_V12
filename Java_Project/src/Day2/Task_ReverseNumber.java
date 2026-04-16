package Day2;

import java.util.Scanner;

public class Task_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		
//		int num=sc.nextInt();

		//********************************************************
		
		/*int num=1234;		
		  int rev=0;
		
		while(num!=0) 
		{
			rev=rev*10+num%10;   //0*10=0 +1234%10 =4.............0 
			num=num/10; // 1234/10 = 123..........0
		}
		System.out.println(rev);
		*/
		
		//using StringBuffer class
		/*int num=7584;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev);
		*/
		
		//Using StringBuilder class
		int num=4826;
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
	
		 StringBuilder rev=sbl.reverse();
		
		 System.out.println(rev);
	}

}
