package day13.collection.list;

import java.util.Stack;

public class StackEx {
	
	/*
	 * Last in First Out 후입선출
	 * => push() pop()
	 */
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		//값 추가
		stack.push("1번 품목 맥북");
		stack.push("2번 품목 에어팟맥스");
		stack.push("3번 품목 아이패드프로");
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		//제거함과 동시에 빠진 값을 리턴함
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
		
	}
	
	
	
}











