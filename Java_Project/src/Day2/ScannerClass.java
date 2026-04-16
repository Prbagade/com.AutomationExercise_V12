package Day2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value?");
		
		int num=sc.nextInt();
		
		//System.out.println(num);
		
		int rev=0;
		
		while(num!=0)
		{		rev=rev*10+num%10;
				num=num/10;
		}
		System.out.println(rev);
	}

}
