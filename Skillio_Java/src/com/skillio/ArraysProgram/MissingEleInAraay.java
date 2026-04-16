package com.skillio.ArraysProgram;

public class MissingEleInAraay {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,5};
		
		int sum1=0;
		int sum2=0;
		int rang=5;

		for(int i=0;i<=arr.length-1;i++) 
		{
			sum1=sum1+arr[i];
		}
		System.out.println("Total sum1 of array: "+sum1);
		
		
		for(int j=0;j<=rang;j++) 
		{
			sum2=sum2+j;
		}
		System.out.println("Total sum2 of array: "+sum2);
		
		
		System.out.println("Missing number :"+(sum2-sum1));
	}
}
