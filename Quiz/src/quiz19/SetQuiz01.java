package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * set 사용
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set 에 6개의 랜덤한 로또 번호를 저장. 
		 */
		Random r = new Random();
		
		Set<Integer> set = new HashSet<>();
		
		while(true) {
			set.add(r.nextInt(1,45));
			if(set.size()==6) {
				break;
			}
		}
		
		System.out.println(set.toString());
		
	}
}
