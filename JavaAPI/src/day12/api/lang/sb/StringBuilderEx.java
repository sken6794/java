package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		
		//StringBuilder - 메인 하나일때 단일 스레드
		//StringBuffer -  멀티 스레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		str = str + "program";
		
		System.out.println(str + "program");
		System.out.println(sb.append("program"));
		
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메소드
		//append() => 문자열 끝에 추가
		sb.append(" 재미없다");
		System.out.println(sb);
		
		//inser() -중간에 추가
		sb.insert(4, " study");
		System.out.println(sb);
		
		//replace() - 문자열 변경
		sb.replace(5, 10, "book");
		System.out.println(sb);
		sb.delete(5,10);
		System.out.println(sb);
		
		
		sb.deleteCharAt(0); //해당 인덱스 삭제
		System.out.println(sb);
		
		
		//reverce() - 거꾸로
		System.out.println(sb.reverse());
		
		//toString() - 문자열로 형 변환
		
		//toString 문자열로 변환
		sb.toString();
		System.out.println(sb.toString());
		
			
		
		
	}

}












