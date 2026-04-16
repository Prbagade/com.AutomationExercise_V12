package com.skillio;

public class Methods_Args {
	
	public void name(int arr []) {
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}	
	}
	
	public static void main(String[] args) {
		
		Methods_Args obj = new Methods_Args();
		
		int arr [] = {4,5,6,7};
		obj.name(arr);
	}

}
