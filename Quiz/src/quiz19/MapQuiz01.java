package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				String m = scan.next();
				if(map.containsKey(m)) {
					System.out.println("이미 등록되어 있는 메뉴 입니다.");
				} else {
					map.put(m, scan.nextInt());
				}
			} else if(menu == 2) { //메뉴판 전체 보기
				//System.out.println(map.toString());
				
				Set<Entry<String, Integer>> iter =  map.entrySet();
				//Iterator<Entry<String, Integer>> rator = iter.iterator();
				
				for (Entry<String, Integer> entry : iter) {
					System.out.println("음식 이름"+entry.getKey()+", 가격 : "+entry.getValue());
				}
				
			} else if(menu == 3) {// 메뉴판 수정
				String update = scan.next();
				if(map.containsKey(update)) {
					map.put(update, scan.nextInt());
				} else {
					System.out.println("해당 메뉴가 없습니다.");
				}
			} else if(menu == 4) { //삭제
				String remove = scan.next();
				if(map.containsKey(remove)) {
					map.remove(remove);
				} else {
					System.out.println("삭제할 메뉴를 다시 입력바람");
				}
			} else if(menu == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

		}


	}
}
