package jdbc.demo.mvc;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//필요한 객체를 상단부에 선언
		DeptsDAO deptsDao = new DeptsDAO();
		
		while(true) {

			System.out.println("[1.조회, 2.추가, 3.수정]");
			System.out.print("메뉴>");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				
				List<DeptsVO> list = deptsDao.getDepts("새로운부서");
				System.out.println(list.toString());
				break;
			case 2:
				//부서명 입력
				System.out.println("부서명>");
				String name = sc.next();
				System.out.println("매니저아이디>");
				int manager_id = sc.nextInt();
				System.out.println("로케이션아이디>");
				int location_id = sc.nextInt();
				
				DeptsVO vo = new DeptsVO(0,name,manager_id,location_id);
				
				//매개변수 전달
				int result = deptsDao.insertDepts(vo);
				System.out.println("성공 1 실패 0 : "+result);
				break;
			case 3:

				break;
			case 4:

				break;
			
			}
		}

	}
}
