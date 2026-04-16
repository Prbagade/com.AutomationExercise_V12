package Java_Logical_Program;

public class CountNumberofDigit {

	public static void main(String[] args) {
		
		//Count number digit in numbers
		
		int num = 445656789;
		
		int count=0;
	
		while(num>0) 
		{
			num=num/10;
			count++;
		}
		System.out.println("Total count of digit: "+count);
			
	}

}
