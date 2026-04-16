package com.skillio.ArraysProgram;

import java.util.Arrays;

public class sortArray {

	
	public static void main(String[] args) {
		
		
		int arr [] = {30,10,40,20,50,60};
		
		//sorting Array
		 Arrays.sort(arr); 
		 
		System.out.println("Ascending sort arrays: ");
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+",");
		}
		
		System.out.println("\nDescending sort arrays: ");
		for(int j=arr.length-1;j>=0;j--) 
		{
			System.out.print(arr[j]+",");
		}
	}
}
