package polyMorphism;

public class loading 
{		

	public static void m1(int x , int y) 
		{		
		
			System.out.println("m1 2 argu "+(x+y));
		
		}
	
	public static void m1(int z,int s, int k) {
		
		System.out.println("m1 3 argu "+(z+s+k));
	}
	
	public static void main(String[] args) {
		
		m1(10,20);
		m1(15,15,15);
	}
	


}
