package Constructor;

public class Constrc_Overloading {

	int length;
	int width;
	
	
	public Constrc_Overloading(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	
	public void areaOfrectangle() 
	{
		System.out.println(" area of rectangle = "+length*width);
	}
	
	public static void main(String[] args) {
	
		Constrc_Overloading obj = new Constrc_Overloading(10,40);
		
		obj.areaOfrectangle();
	}
}
