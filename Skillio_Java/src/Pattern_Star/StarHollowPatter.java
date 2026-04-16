package Pattern_Star;

public class StarHollowPatter {

	public static void main(String[] args) {
		
		//Hollo Star pattern
		
		for(int line=1;line<=5;line++) 
		{
			for(int str=1;str<=5;str++) 
			{
				if(line >=2 && str >=2 && line<=4 && str <=4) 
				{
					
					System.out.print("  ");
				}
				else 
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}

	}

}
