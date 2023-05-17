package day13.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		
		
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(1);
		que.offer(3);
		que.offer(2);
		que.offer(6);
		que.offer(4);
		que.offer(7);
		System.out.println(que.toString()); // 1 3 2 6 4 7 
		//꺼낼 때 정렬 되어서 작은순으로 꺼내짐
		System.out.println(que.poll());//1
		System.out.println(que.poll());//2
		System.out.println(que.poll());//3
		System.out.println(que.poll());//4
		System.out.println(que.poll());//6
		System.out.println(que.poll());//7
		System.out.println(que.toString());
 		
		System.out.println("============================================");
		//큐가 순서를 확인할 때 compareTo 메소드를 확인한다.
		//compareTo에 정의된 순서에 의해서 우선순위를 정한다.
		//객체가 우선순위를 가지게 하려면 
		// comparable 인터페이스를 상속받아서 compareTo 메소드를 오버라이딩 해서 가지면 된다.
		Queue<User> queue  = new PriorityQueue<>();
		
		//우선순위 지정
		//System.out.println("홍길동".compareTo("홍길자")); //홍길동이 사전적으로 앞에 위치하기에 음수
		//System.out.println("홍길자".compareTo("홍길동")); //홍길자가 사전적으로 뒤에 위치하기에 양수 
		
		//System.out.println("b".compareTo("a"));
		
		
		queue.offer(new User("홍길동", 10));
		queue.offer(new User("홍길순", 30));
		queue.offer(new User("홍길자", 20));
		queue.offer(new User("신사임당", 40));
		
		//System.out.println("가장 먼저 나온 객체의 이름 : "+queue.poll().getName());
		System.out.println(queue.toString());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
















