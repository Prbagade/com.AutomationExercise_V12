package Arrays;

public class ArraySumOfElement {

	public static void main(String[] args) {

		//Sum of Elements in array 
		int arr [] = {4,5,7,1,3};
		
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) 
		{
			temp=temp+arr[i];
			
		}
		System.out.println(temp);
	}
}
