package Day3;

public class PrimeNoSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				for(int i = 1; i<=60; i++) 
		            {
					int count = 0;
					for(int j = 1; j<=60; j++) 
		              {
						if(i%j==0)  
		                 {
						count++;
						}
					            }
					if(count==2)
		                 {
						System.out.print(i+" ");
					}
				}
	}

}
