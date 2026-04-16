package JavaBasic.copy;

import JavaBasic.Non_Static;

public class Non_static2 {

	
	public void s4(){
		System.out.println("Tiger");
	}
	
	public static void main(String[] args) {
		
		Non_static2 obj = new Non_static2();
		obj.s4();
		
		// Non_Static method called from same pack  
		Non_Static obj2 = new Non_Static();
		obj2.s2();
		
		
	}
}
