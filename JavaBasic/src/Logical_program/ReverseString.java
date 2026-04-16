package Logical_program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java Reverse String program
		// Palindrom Number/name

		// scanner

		System.out.println("Enter input here...");

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

//		String str = "GandhiNagar";
//		String str = "Madam";
//		String str = "151";

		char[] ch = str.toCharArray(); // convert char to arrays index

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(" " + ch[i]);
		}

		System.out.println("\n \t Orginal string = " + str);
	}
}
