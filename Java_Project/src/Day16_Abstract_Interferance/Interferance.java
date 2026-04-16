package Day16_Abstract_Interferance;



interface shape
{
	int length=10; //final & static 
	int width=20; //final & static
	
	
	void circle(); //abstract method
	
	default void square() 
	{
		System.out.println("This is sqaure - defualt method");
	}
	
	static void rectangle() 
	{
		System.out.println("This is rectangle - static method");
	}
	
}

public class Interferance implements shape
{
	
	public void circle()
	{
		System.out.println("This is circle - deafult method");	
	}
	
	void triangle() 
	{
		System.out.println("This is triangle...");
	}
	

	public static void main(String[] args) {

		//Scenario 1
		Interferance obj = new Interferance();
		
		obj.circle(); //abstract
		obj.square(); //default
		
		shape.rectangle(); //static method directly access from interface
		
		obj.triangle();
		
		//Scenario 2
		shape sh = new Interferance();
		
		sh.circle(); //abstract
		sh.square(); //default
		
		shape.rectangle(); //static method directly access from interface	
		
		
	}

}
