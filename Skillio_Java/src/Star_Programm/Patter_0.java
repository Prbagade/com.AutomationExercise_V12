package Star_Programm;

import java.util.Scanner;

public class Patter_0 {

	// Star pattern
		
/*	line	astrik
	 1		1, 
	 2  	1, 2, 
	 3 		1, 2, 3
	 4 		1, 2, 3, 4
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start Number:");
		
		int star =sc.nextInt();
		//working principle-- 
		// 1st line forloop will run 1 is lessthan 4 true then 
		// next 2nd forloop will run check cond 1 is = 1 or not if = then print *
		// then incre by 1 i.e 2 is condi true then again print * 
		// or condi fail then 2nd loop exit 1st loop print e.i next line
		//.....these phenomone run till 1st forloop false i.e 5
		
	for(int line =1; line <=star;line ++ ) //print lines 
		{
			for(int ast=1;ast<=line;ast++) { //print star
				
				System.out.print("* ");  //print 
			}
			System.out.println();  // print
		}
	}
}
