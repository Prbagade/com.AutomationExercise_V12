package Day4;

public class FindRepetationNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50,60,40,40};
		
		int repeat_no=10;
		int count=0;
	
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==repeat_no) 
			{
			
				count++;
			}
		}
		System.out.println(count);

	}

}
