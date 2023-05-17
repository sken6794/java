package quiz08;

public class MyCart_1 extends Cart{ //강사님 버전
	
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
	
	MyCart_1(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	
	
	
	void buy(String product) {
			
			switch (product) {
			case "tv":
				
				if(this.money < 300) {
					System.out.println("금액 부족");
					return; //함수 종료
				} else {
					this.money -= 300;
				}
				
				break;
			case "com":
				if(this.money < 400) {
					System.out.println("금액 부족");
					return; //함수 종료
				}else {
					this.money -= 400;
				}
				break;
			case "radio":
				if(this.money < 500) {
					System.out.println("금액 부족");
					return; //함수 종료
				}else {
					this.money -= 500;
				}
				break;

			default:
				System.out.println("올바른 상품이 아닙니다.");
				break;
			}
			
			add(product); //물픔을 담는 함수로 전달
		
	}
	void add(String product) {
		if(i >= cart.length) { //기존 배열이 꽉찬 경우
			//2배인 배열 생성
			String[] newCart = new String[cart.length*2];
			//기존 배열의 값을 복사
			for (int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			//기존배열을 변경
			cart = newCart;
			newCart = null; //삭제
		}
		cart[i] = product;
		i++;
		
	}

	void info() {
		String str = "[";
		for (int j = 0; j < i; j++) {
			str += cart[j] +" "; 
		}
		str += "]";
		System.out.println(str);
	}
}
