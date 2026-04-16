package Day1;

public class Task_WeekNumber {

	public static void main(String[] args)
	{
		String  weekNo="frai";
		
		switch(weekNo) 
		{
		case "monday" : System.out.println(1); break;
		case "tuesday" : System.out.println(2); break;
		case "Wednesday" : System.out.println(3); break;
		case "thursday" : System.out.println(4); break;
		case "fraiday" : System.out.println(5); break;
		case "saturday" : System.out.println(6); break;
		default : System.out.println("Invalid week");
		}
	}
}
