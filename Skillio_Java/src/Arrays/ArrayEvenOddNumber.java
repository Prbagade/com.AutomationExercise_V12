package Arrays;

public class ArrayEvenOddNumber {

	public static void main(String[] args) {

		//Even and Odd number in Arrays
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8,9,10 };

		System.out.println("Even Number in Arrays");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {

				System.out.println(arr[i]);
			}
		}

		System.out.println("Even Number in Arrays");
		
		for(int j=0;j<=arr.length-1;j++) 
		{
			if(arr[j]%2!=0) 
			{
				System.out.println(arr[j]);
			}
		}
		
	}

}
