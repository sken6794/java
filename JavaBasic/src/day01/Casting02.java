package day01;

public class Casting02 {

	public static void main(String[] args) {
		
		//크기가 큰 타입을 작은 타입에 저장할 경우 (type) 캐스팅을 사용해서 명시적으로 변환
		int i = 70;
		char c = (char) i; 
		short s = (short) i;
		
		System.out.println(c); //F
		System.out.println(s); //70
		
		float f = 3.14F;
		int k = (int) f;
		System.out.println(k);
		
		//주의할 점 - 타입 변환 시 값을 받을 수 없는 범위가 들어오면 잘려나간 값(Trash)을 저장한다.
		int a = 1000;
		byte b = (byte) a;
		System.out.println(b); // -24
		
		//특이케이스 - 문자와 숫자간에도 명시적 형 변환이 일어난다.
		// 데이터 타입 확인 ((Object)변수명).getClass().getName()
		char cc= 'a';
		short ss = (short) cc;
		System.out.println(ss);
		System.out.println(((Object)ss).getClass().getName());
		
	

	}

}














