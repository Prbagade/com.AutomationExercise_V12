package Day3;

public class SingleDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring array
		
		//Approach 1
	/*	int a[] = new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[3]);
	*/
		
		//Approach 2
	int a[]= {100,200,300,400,500};
	
	System.out.println("Length of array = "+a.length);
	
	System.out.println(a[2]);
	
	
	
	//reading all data from array
	
/*	//Noraml for loop
	for(int i=0;i<a.length;i++) // i<=4   i<5   i<=a.lenght-1     i<a.lenght     
	{
		System.out.println(a[i]);
	}
*/	
	
	//enhanced for loop / for each loop
	for(int x:a) 
	{
		System.out.println(x);
	}
		
		
		
	}

}
