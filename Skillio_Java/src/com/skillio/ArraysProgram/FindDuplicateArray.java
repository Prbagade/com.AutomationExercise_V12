package com.skillio.ArraysProgram;

public class FindDuplicateArray {
	
	public static void main(String[] args) {
		
		//Find duplicate element in array
		int arr [] = {4,5,2,1,3,2,4,3};

		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=i+1;j<=arr.length-1;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	
	}
	
}
