package day10.static_basic;


public class MainClass {

	public static void main(String[] args) {
		
		String[] s = {"a","a","a","a"};
		int[] i = {1,2,3,4,5};
		char[] c = {'a','a','a','a'};
		
		System.out.println(MyArrays.printArray(s));
		System.out.println(MyArrays.printArray(i));
		System.out.println(MyArrays.printArray(c));
		System.out.println(MyArrays.printArray(new int[3]));
		System.out.println(MyArrays.printArray(new String[3]));
		
		//클래스가 여러 번 로드 되어도 static 블럭은 딱 한번만 실행됨 
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		
	}

}
