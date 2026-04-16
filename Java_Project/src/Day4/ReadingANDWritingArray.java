package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingANDWritingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println("Enter the Input for position = "+i);
			a[i]=sc.nextInt();
			
		}
		System.out.println("Print array...");
		System.out.println(Arrays.toString(a));
		
				
	}

}
