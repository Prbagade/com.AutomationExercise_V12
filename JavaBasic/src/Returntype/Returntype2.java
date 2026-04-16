package Returntype;

public class Returntype2 {

	String popSong() 
	{
		 String str = "blue eyes super hit";
		 
		 System.out.println(str);
		 return str;
	}
	
	void JazzSong() 
	{
		Returntype2 e = new Returntype2();
		e.popSong();
		String str1 = "Mere Sayanji";
		
		System.out.println("Yo yo honey singh "+popSong());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returntype2 e =  new Returntype2();
		e.JazzSong();
//		e.popSong();
		
	}

}
