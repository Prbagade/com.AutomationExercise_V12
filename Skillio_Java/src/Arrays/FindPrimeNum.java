package Arrays;

public class FindPrimeNum {

	public static void main(String[] args) {

		int arr[] = { 10,11,12,13,14,15,16,17,18,19,20 };

		for (int i = 1; i <arr.length-1; i++) {
			int count=0;
			for(int j=2;j<arr[i];j++) 
			{
				if(arr[i]%j==0) 
				{
					count++;
					break;
				}
			}
			if(count==0) 
			{
				System.out.println("Prime num = "+arr[i]);
			}
		}
	}
}
