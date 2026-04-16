package Java_Logical_Program;

import java.util.Scanner;

public class armStrongNumber {

	// ArmStrong number check --> 153

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Armstrong Number : ");

		int num = sc.nextInt();

		int temp = num; // to store for no change original numb
		int sum = 0; // to store total of number
		int rem; // to store reminder

		while (temp > 0) {
			rem = temp % 10; // extract last num
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		if (sum == num) {
			System.out.println("Armstrong number :" + num);
		} else {

			System.out.println("Not armstrong number :" + num);
		}
	}
}
