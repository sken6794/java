package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass2 {

	public static void main(String[] args) {
		
		/*
		 * 람다 함수의 구현 사용문법
		 * Predicate - 매개변수가 하나 있고, boolean형 반환
		 * Consumer - 매개변수 하나 받고 void 형 반환 (대표적으로 forEach)
		 * Function - 매개변수 여러개 받고, 반환은 임의의 값
		 * 
		 */
		
		
		List<Integer> list = new ArrayList<>();
		
		Random ran = new Random();
		
		for(int i = 0; i<15; i++) {
			
			list.add(ran.nextInt(1,15));
		}
		System.out.println(list.toString());
		
		//중간처리 
		// 1. distinct() - 중복 제거
		//Stream<Integer> st = list.stream();
		//st = st.distinct(); //중복 제거
		//st.forEach((a)-> System.out.print(a+" "));
		
		list.stream().distinct().forEach((a)-> System.out.print(a+" "));
		
		System.out.println("\n=========================================================");
		
		//sorted() - 정렬
		list.stream().distinct().sorted().forEach((a)->System.out.print(a+" "));
		System.out.println();
		//filter() - 리턴에 true값만 남기고 필터링 => 짝수만
		list.stream().distinct().filter((a) -> a%2==0).sorted().forEach((a)->System.out.print(a+" "));
		System.out.println("\n=========================================================");
		
		//map() - 반환에 정의 된 값으로 완전히 새로운 스트림 반환
		list.stream().map((a) -> a%2==0? "짝수":"홀수").forEach(a -> System.out.print(a+" "));		
		
		System.out.println("\n=========================================================");
		
		//mapToDouble()
		//mapToInt()
		//mapToLong()
		list.stream().mapToDouble( a -> a).forEach(a -> System.out.print(a+" "));
		
		
	}
}















