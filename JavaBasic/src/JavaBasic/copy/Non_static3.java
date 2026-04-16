package JavaBasic.copy;

import JavaBasic.Non_Static;

public class Non_static3 {

	public void s3() {
		System.out.println("I am lion of the jungle");
	}
	
	public void s5() 
	{
		System.out.println(" 123456");
		m6();
	}
	
	public static void m6() 
	{
		System.out.println("Welcome to Washim city");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_static3 obj = new Non_static3();
		
		obj.s3();
		obj.s5();
		m6();
		
		// Non_Static method called from diff pack
		Non_Static obj2 = new Non_Static();
		obj2.s1();
	}

}
