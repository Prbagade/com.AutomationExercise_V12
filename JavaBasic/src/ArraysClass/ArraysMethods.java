package ArraysClass;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		int arr [] = {30,60,20,40,10,80,50};

		//Array Sort()
		Arrays.sort(arr);
		
		
		System.out.println("Ascending Array order ");
		//for loop
		for(int i=0;i<=arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("***********************************");
		
		System.out.println("Descending Array order ");
		
		for(int i=arr.length-1;i>=0;i--) 
		{
			System.out.println(arr[i]);
		}
	}

}
