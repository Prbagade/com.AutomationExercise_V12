package com.skillio.StringProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		//String reverse should be match original string 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");

		String str = sc.next();
		String org_str = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (org_str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String: " + rev);

		} else {
			System.out.println("Not Palindrome String: " + rev);

		}

	}

}
