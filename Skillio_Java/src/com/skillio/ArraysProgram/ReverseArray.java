package com.skillio.ArraysProgram;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		// Reverse the array

		int arr[] = { 40, 70, 20, 50, 30, 10 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ",");
		}

	}
}
