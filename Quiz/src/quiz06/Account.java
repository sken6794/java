package quiz06;

public class Account {
	//한사람의 은행 계좌
	/*
	 * accountNumber 변수 -식별아이디
	 * password - 비밀번호
	 * balance 변수 - 잔고
	 * 
	 * 생성자 
	 * 3가지를 모두 받아서 초기화하는 기능
	 * 
	 * 메소드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능 확인
	 */
	
	String accountNumber;
	String password;
	int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String num, String ps, int bal) {
		accountNumber = num;
		password = ps;
		balance = bal;
	}
	
	void deposit(int s) {
		if(s > 0) {
			balance += s;
		}
		
	}
	
	void withDraw(int s) {
		if(s > 0 && balance > s) {
			balance -= s;
			
		}
	}
	
	int getBalance() {
		return balance;
	}
	
}
