package polyMorphism;

public class Riding2 extends Riding{

	//Overriding
	public void m1() 
	{
//		System.out.println("i have cat");
		System.out.println("i have dog");
	}
	
	public static void main(String[] args) {
		
		Riding2 obj = new Riding2();
		
		obj.m1();
	}

}
