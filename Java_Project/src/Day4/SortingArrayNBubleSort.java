package Day4;

import java.util.Arrays;

public class SortingArrayNBubleSort {

	public static void main(String[] args) {
	
		int a[]= {50,20,40,10,30};
		
		System.out.println("Before sorting"+Arrays.toString(a));
		
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) // number of passes 
		{
			for(int j=0;j<n-1;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting"+Arrays.toString(a));
	}

}
