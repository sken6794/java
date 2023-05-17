package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("java1547", "1234aaaa", 0);
		ac.deposit(50000);
		System.out.println(ac.getBalance());
		ac.withDraw(20000);
		System.out.println(ac.getBalance());
		
	}

}
