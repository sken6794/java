package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {
		
		/* 
		 * List1
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 2. list의 값을 순서대로 출력
		 */
		
		/*
		 * List2
		 * 1. User를 저장하는 list 생성
		 * 2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3. User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
		 * 4. User 객체 안에 홍길자 가 있으면 해당 객체를 삭제 코드
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=20; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		User user1 = new User("홍길동", 20);
		User user2 = new User("홍길자", 30);
		User user3 = new User("홍길동자", 40);
		
		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		for(int i = 0; i<userList.size(); i++) {
			if(userList.get(i).getName().equals("홍길동")) {
				System.out.println("이름 : "+userList.get(i).getName() +" 나이 : "+userList.get(i).getAge() );
			}
		}
		
		for(int i = 0; i<userList.size(); i++) {
			if(userList.get(i).getName().equals("홍길자")) {
				userList.remove(i);
			}
		}
		/*
		for(int i = 0; i<userList.size(); i++) {
			System.out.println(userList.get(i).getName()+userList.get(i).getAge());
		}
		*/
		for(User u : userList) {
			System.out.println("이름 : "+u.getName()+"나이 "+u.getAge());
		}
		
		
	}
}












