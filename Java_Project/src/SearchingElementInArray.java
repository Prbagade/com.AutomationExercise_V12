
public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		int serch_ele=30;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==serch_ele) 
			{
				System.out.println("Element found = "+serch_ele);
				status=true;
				break;
			}
		}
		if(status==false) 
		{
			System.out.println("Not found");
		}
	}
}
