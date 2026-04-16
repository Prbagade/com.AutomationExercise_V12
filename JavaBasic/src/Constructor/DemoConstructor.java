package Constructor;

public class DemoConstructor 
{
	//Constructor overloading
	public DemoConstructor() 
	{
		
		System.out.println("Its 1nd constructor");
		
	}
	public DemoConstructor(int x) 
	{
		System.out.println("Its 2nd constructor"+x);
	}
	public DemoConstructor(String ram) 
	{
		
		System.out.println("Its 3nd constructor"+ram);
	}
	
	
	
	
	public static void main(String[] args) {
	
		DemoConstructor obj1 = new DemoConstructor();

		DemoConstructor obj2 = new DemoConstructor(" "+200);
		
		DemoConstructor obj3 = new DemoConstructor(" "+"jai shree ram");
		
		
		
		
		
	}

}
