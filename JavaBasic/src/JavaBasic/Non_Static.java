package JavaBasic;

public class Non_Static {

	public void s1() 
	{
		System.out.println("Dog");
	}
	
	public void s2() {
		System.out.println("Cat");
	}
	
	public static void main(String[] args) {
		
		
		Non_Static obj = new Non_Static();
		
		obj.s1();
		obj.s2();
		
		
		
	}
	
}
