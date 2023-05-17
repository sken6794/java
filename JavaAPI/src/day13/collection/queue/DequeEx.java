package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	public static void main(String[] args) {
		
		
		//ArrayDeque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		//뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString()); // 1 2 3 4
		
		//앞에서 꺼내기
		System.out.println("반환된 원소 : "+que.pollFirst()); // 1
		System.out.println("반환된 원소 : "+que.pollFirst()); // 2
		System.out.println("반환된 원소 : "+que.pollFirst()); // 3
		System.out.println("반환된 원소 : "+que.pollFirst()); // 4
		System.out.println(que.toString());
		
		System.out.println("==============================================");
		
		//앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString()); // 4 3 2 1 
		
		//뒤에서 꺼내기
		System.out.println("반환된 원소 : "+que.pollLast()); // 1 
		System.out.println(que.toString()); // 4 3 2 
		
		
		System.out.println("==============================================");
		//list의 get 처럼 앞에서 or 뒤에서 값을 확인만
		// 4 3 2 
		System.out.println(que.peekFirst()); // 4
		System.out.println(que.toString()); // 4 3 2 제거되는게 아니라 첫번째 값만 확인함
		
		System.out.println(que.peekLast());
		
		
		
		
		
		
		
		
		
	}
}
















