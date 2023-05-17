package quiz06;

import java.util.Scanner;

public class MyAccount extends Account{

	
	public MyAccount(String num, String ps, int bal) {
		accountNumber = num;
		password = ps;
		balance = bal;
	}
	
	
	void withDraw(int s) {
		Scanner scan = new Scanner(System.in);
		if(password.equals(scan.nextLine()) ) {
			if(s > 0 && balance > s) {
				balance -= s;
				
			}else {
				System.out.println("잔액부족");
			}
		} else {
			System.out.println("비번 다름");
		}
		
	}
	
	
	
}
