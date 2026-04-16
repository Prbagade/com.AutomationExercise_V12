package Java_Logical_Program;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {

		// factorial programm of 5

		// 5*(5-1)*(5-2)*(5-3)*(5-4) =120
		// 5*4*3*2*1 = 120

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter foctorial num :");
		int num = sc.nextInt();
		int fact = 1;

		if (num < 0) {
			System.out.println("Undefined factorial num = " + num);
		}
		else if (num > 20) {
			System.out.println("Undefined factorial num = " + num);
		} 
		else {

			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+ num + " = " + fact);
		}
	}
}
