package Arrays;

public class TwoDiamentionalArray {

	
	public static void main(String[] args) {
		
		int [] [] arr = {{1,2,3},{4,5,6,7},{8,9}};
		
		
		for(int p=0;p<=arr.length-1;p++) 
		{
			for(int c=0;c<=arr[p].length-1;c++) 
			{
				System.out.print(arr[p][c]+",");		
			}
			System.out.println();
		}
	}
}
