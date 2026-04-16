package Arrays;

import java.util.Arrays;

public class Arr_2_Sorting {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 2, 6, 1, 9, 3, 8, 4 };

		// sorting
		Arrays.sort(arr);

		System.out.println("sort/Ascending order.........");

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

//	System.out.println("+++++++++++++++++++++++++++++++++++++++");

		System.out.println("Reverse/Descending order.........");

		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}
}
