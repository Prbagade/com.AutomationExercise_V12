package DecisionMakingCondi;

public class If_else {

	
	public static void main(String[] args) {
		
		int marks = 85;
		
		if(marks >=90) 
		{
			System.out.println("Pass with 'A' grade");
		}
		else if(marks >=70 && marks <=90) 
		{
			System.out.println("Pass with 'B' grade");
		}
		else if(marks >=50 && marks <=70) 
		{
			System.out.println("Pass with 'C' grade");
		}
		else {
		System.out.println("Fail with 'D' grade");
		}
		
	}
}
