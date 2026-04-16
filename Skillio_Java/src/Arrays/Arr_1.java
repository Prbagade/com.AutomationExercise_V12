package Arrays;

public class Arr_1 {

	public static void main(String[] args) {

		//using new keyword
		
		
		//using literals
		int arr[] = { 15, 25, 20, 14, 24, 10 ,17};

		System.out.println(arr.length); //total-1; //6

		/*
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] % 2 != 0) { 
				System.out.println(arr[i]); //even/odd num print
		}
			}
			*/
		
		//Addition of array
		int [] arr2 = {5,4,7,3,2};
		
		int res=0;
		
		for(int s=0;s<=arr2.length-1;s++) 
		{
			res=res+arr2[s];
		}
		System.out.println(res); 
		
	}
}
