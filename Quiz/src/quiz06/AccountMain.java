package quiz06;

public class AccountMain {

	public static void main(String[] args) {
		
		
		
		MyAccount myac = new MyAccount("abc123","abc123456",0);
		
		
		myac.deposit(5000);
		myac.withDraw(5000);
		System.out.println(myac.balance);
		
		
	}

}
