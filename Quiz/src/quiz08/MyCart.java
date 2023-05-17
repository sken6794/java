package quiz08;

public class MyCart extends Cart{
	
	/*
	 * 1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com = 400, radio=500;
	 * 
	 * 2. buy(), add(), info() 메소드 오버라이드
	 * 상품명 "tv", "com" , "radio"
	 * buy(상품명)  => 매개변수가 tv, com, radio 라면 금액에서 상품가격을 차감, add() 실행
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우 적절한 처리 필요
	 * 
	 * add(상품명) 기능
	 * => 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옮겨주세요.
	 * 
	 * 마지막, info()메소드 호출
	 * info() => cart배열에 담긴 물건 목록만 (null 제외) 출력
	 */
	
	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	
	void buy(String product) {
		if(!product.equals("tv") && !product.equals("com") && !product.equals("radio")) {
			System.out.println("올바른 상품이 아닙니다.");
			return;
		}
		if(product.equals("tv")) {
			if(money < tv) {
				System.out.println("금액부족");
			} else {
				System.out.println("tv구매 완료");
				money -= tv;
				add(product);
				System.out.println("잔액 : "+money);
			}
		}
		
		if(product.equals("com")) {
			if(money < com) {
				System.out.println("금액부족");
			} else {
				System.out.println("com구매 완료");
				money -= com;
				add(product);
				System.out.println("잔액 : "+money);
			}
		}
		
		if(product.equals("radio")) {
			if(money < radio) {
				System.out.println("금액부족");
			} else {
				System.out.println("radio구매 완료");
				money -= radio;
				add(product);
				System.out.println("잔액 : "+money);
			}
		}
	}
	
	void add(String product) {
		if(cart[cart.length-1]!=null) {
			String[] newCart = new String[cart.length*2];
			for (int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			newCart = null;
		}
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null) {
				cart[i] = product;
				break;
			} 
		}
		
		
	}

	void info() {
		for (int i = 0; i < cart.length; i++) {
			if(cart[i]!=null) {
				System.out.print(cart[i]+" ");
			} 
		}
	}
}
