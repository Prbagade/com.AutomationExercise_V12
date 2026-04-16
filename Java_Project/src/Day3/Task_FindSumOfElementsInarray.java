package Day3;

public class Task_FindSumOfElementsInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int a[]= {1,2,3,4,5};

	 int sum=0;
	 
	/* for(int i=0;i<a.length;i++) 
	 {
		 sum=sum+a[i]; //
	 }
	 System.out.println(sum);
	 */
	 
	 //enhaced for loop
	 for(int x:a)
	 {
		 sum=sum+x;
	 }
	 System.out.println(sum);
	}
}
