package com.skillio.ArraysProgram;

public class SearchElementInArray {

	public static void main(String[] args) {

		// Search Element In Array
		int arr[] = { 30, 40, 10, 50, 60, 70, 20 };

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 40) {
				System.out.println(arr[i]);
			}
		}

	}

}
