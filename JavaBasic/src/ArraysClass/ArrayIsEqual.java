package ArraysClass;

import java.util.Arrays;

public class ArrayIsEqual {

	public static void main(String[] args) {

		int arr1 [] = {10,20,30,40,50};
		int arr2 [] = {10,40,30,40,50};
		int arr3 [] = {10,20,30,40,50};
			
		//arrays content check
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		
		//referance checks
		System.out.println(arr1==arr2);
		System.out.println(arr1==arr3);// showing false but its true
		
	}
}

