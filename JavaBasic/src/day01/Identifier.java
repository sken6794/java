package day01;

public class Identifier {

	public static void main(String[] args) {
		
		//변수명은 대소문자를 구분한다.
		int age = 27;
		int Age = 28;
		
		System.out.println(age); //27
		System.out.println(Age); //28
		
		
		//숫자로 시작할 수 없음
		//int 4num = 10;
		int num4 = 10;
		System.out.println(num4);
		
		//카멜표기법 - 연결된 단어의 첫 번째 글자는 대문자로 한다.
		//int phonenumber = 10;
		int phoneNumber = 10;
		
		//키워드로는 이름을 지을 수 없다.
		//int class = 10;
		
		//변수 선언 방법
		// <데이터 유형> <변수명> ; 
		// 선언은 데이터타입, 변수명을 만드는 과정. 
		// ex) int abc;
		// 초기화 = 선언 후 초기값을 저장하는 행위
		// ex) abc = 1;
		// 선언과 초기화를 같이 할 수 있음
		// ex) int abc = 1;
		// 프로그램에서 '=' 기호는 우측에 있는 값을 좌측에 대입한다는 개념.
		// ex) a=1; 1을 a에 대입한다.
		
	}

}
