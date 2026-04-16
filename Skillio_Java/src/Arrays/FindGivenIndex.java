package Arrays;

import java.util.Scanner;

public class FindGivenIndex {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter arry ");
//				int num =obj.nextInt();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 30) {
				
				System.out.println("Given array index numb = " + i);
//				break;
			}
//			else 
//			{
//				System.out.println("Wrong number entered = ");
//				break;
//			}
		}

	}
}
