package day13.collection.list;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		/*
		 *LinkedList
		 * => 순서 o ,중복 o 
		 * => 노드객체 (양방향 연결리스트)
		 * 삽입, 삭제는 ArrayList보다 좋으나, 탐색은 느리다. 
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//list와 기능은 동일하다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3,10); //3번째 인덱스에 10추가
		System.out.println(list.toString());

		//값 가져오기 get()
		System.out.println(list.get(3));
		
		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("=================================================");
		
		///linkedlist는 queue의 기능을 구현하기 때문에 queue 기능도 사용 가능
		//뒤에다가 집어넣음
		list.offer(10);
		list.offer(11);
		System.out.println(list.toString());
		//앞에서부터 값을 빼냄
		int i = list.poll();
		System.out.println(i);
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
	}
}
















