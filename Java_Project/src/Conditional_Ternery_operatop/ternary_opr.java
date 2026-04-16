package Conditional_Ternery_operatop;

public class ternary_opr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
	
		int x=(a>b)?100:200; //false
		System.out.println(x); //200
		
		int q=(a<b)?100:200; //true
		System.out.println(q); //100
		
		int s=(a==b)?50:100; //false
		System.out.println(s); //100
		
		int person_age=30;
		String res =(person_age>=20)?"Elegible":"Not eligible";
		System.out.println(res); // elegible
		
	}

}
