package DecisionMakingCondi;

public class SwitchCase {

	public static void main(String[] args) {

		String shape = "squar";

		switch (shape) {
		case "rectangle":
			int l = 20, b = 40;
			int area = l * b;
			System.out.println("area of reactangle:" + area);
			break;

		case "circle":
			int r = 10;
			System.out.println("area of circle :" + (3.14 * r * r));
			break;

		case "squar":
			int a = 20;
			System.out.println("Area of square :" + a * a);
			break;

		default:
			System.out.println("Invalid shape");
		}
	}
}
