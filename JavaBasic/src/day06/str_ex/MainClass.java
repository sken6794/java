package day06.str_ex;

public class MainClass {

	public static void main(String[] args) {
		
		String str1= "홍길동";
		String str2= "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("============================================");
		
		//같은 파일에서 선언한 홍길동은 같은 객체를 참조
		System.out.println(str1 == str2); //true
		// 직접 생성명령을 내리거나 다른클래스에서 넘어온 String은 다른 주소를 나타내게 된다.
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
		
		//null safety (null 안정성)이 없어서 에러를 발생 시킬 수 있다.
		if(str1.equals(str3)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
	}

}
