package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();

		while(true) {
			System.out.println("[1. 등록 | 2. 회원정보확인 | 3. 회원정보검색 | 4.회원정보삭제 | 5.프로그램 종료]");
			System.out.print("메뉴(번호) > ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				String name = sc.next();
				int age = sc.nextInt();
				User us = new User(name, age);
				list.add(us);
				break;
			case 2:
				//리스트에 담긴 모든 회원 이름, 나이를 출력
				for (User u : list) {
					System.out.println("이름 : "+u.getName()+" 나이 : "+u.getAge());
				}
				break;
			case 3:
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면 해당 회원 정보 출력
				//조건 - 찾는 이름이 없으면 "~~는 목록에 없습니다"
				String searchName = sc.next();
				int count = 0;
				for (User u : list) {
					if(u.getName().equals(searchName)) {
						System.out.println("이름 : "+u.getName()+" 나이 : "+u.getAge());
						count++;
					} 
				}
				if(count == 0) {
					System.out.println(searchName+" 는(은) 목록에 없습니다.");
				}
				
				break;
			case 4:
				//삭제할 이름을 입력받아서 이름과 동일한 user객체 첫번째 1개만 삭제
				String removeName = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(removeName)) {
						list.remove(i);
						break;
					}
				}
				break;
			case 5:
				//프로그램 종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				break;
			}
		}




	}
}
