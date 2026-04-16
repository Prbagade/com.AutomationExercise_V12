package Day12_Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
	
		Account acc= new Account();
		
		acc.setAccno(101);
		acc.setName("Praful Bagade");
		acc.setAmount(150000);
		
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
