package com.skillio.ArraysProgram;

public class FindLargestSmallestArray {

	public static void main(String[] args) {

	// Max ele & Min ele in array 
	int arr [] = {20,40,10,60,90,80};
		
	int max =arr[0];
		
	for(int i=0;i<=arr.length-1;i++) 
	{
		if(arr[i]>max || arr[i]<max) //check condition
		{
			max=arr[i]; //max array ele
		}
	}
		System.out.println("Maximum element in array: "+max);
	
	int min =arr[0];
	
	for(int j=arr.length-1;j>=0;j--) 
	{
		if(arr[j]<min) 
		{
			min=arr[j];
		}
	}
	System.out.println("Minimum element in array: "+min);
	
	}
}
