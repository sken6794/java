package day01;

public class Operator03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if() ==> ()안이 true면 실행 false라면 else문 실행
 		if( x != 10 & ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
 		System.out.println("x값 : "+ x);
 		System.out.println("y값 : "+ y);
 		
 		
 		if(x ==10 | ++y == 21) {
 			System.out.println("참");
 		} else {
 			System.out.println("거짓");
 		}
 		
 		System.out.println("x값 : "+ x);
 		System.out.println("y값 : "+ y);
 		
 		
 		System.out.println("============================================================");
 		
 		x = 10;
 		y = 20;
 		
 		if( x != 10 && ++y == 21) { // &&를 사용하면 왼쪽 항이 거짓일 경우 오른쪽 항은 실행하지 않음
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
 		System.out.println("x값 : "+ x);
 		System.out.println("y값 : "+ y);
 		
 		
 		if(x == 10 || ++y == 21) { // ||를 사용하면 왼쪽 항이 참일 경우 오른쪽 항은 실행하지 않고 true 반환
 			System.out.println("참");
 		} else {
 			System.out.println("거짓");
 		}
 		
 		System.out.println("x값 : "+ x);
 		System.out.println("y값 : "+ y);
	}

}

















