package polyMorphism;

public class loading2 extends loading
{
	public void m1(int i,  int j, int k,int p) {
		
		System.out.println("m1 4 argu "+(i+j+k+p));
		
	}

	public static void main(String[] args) {
		
		m1(20,30);
		m1(25,25,25);
		
		loading2 obj = new loading2();
		
		obj.m1(10,10,10,10);
	}
	
	
	
}
