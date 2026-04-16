package Arrays;

public class Arr_4_SortingWay2 {

	
	public static void main(String[] args) {

		int[] arr = { 11, 15, 17, 20, 26, 24, 7, 3 };

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] > arr[i + 1]) {

					int extr = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = extr;
				}
			}
		}

		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
}
