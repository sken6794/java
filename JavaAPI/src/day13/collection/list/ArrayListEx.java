package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * =>배열기반
		 * => 순서 o 중복 o
		 */
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list에 추가 add()
		list.add("맥북");
		list.add("에어팟맥스");
		list.add("아이패드프로");
		list.add("아이맥");
		list.add("매직패드");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//길이 확인 size()
		System.out.println(list.size());
		
		//중간에 추가 add()
		list.add(2, "아이폰14 프로");
		System.out.println(list.toString());
		
		//값의 확인 get()
		String n = list.get(3);
		System.out.println(n);
		
		//값의 제거
		list.remove(3);
		System.out.println(list.toString());
		list.remove("맥북");
		System.out.println(list.toString());
		
		
		//값의 수정 set()
		list.set(3, list.get(3)+" 구매완료");
		System.out.println(list.toString());
		
		//contains() t, f 로 반환
		if(list.contains("에어팟맥스")) {
			System.out.println("있음");
		}
		
		if(list.isEmpty()) {
			System.out.println("비었음");
		} else {
			System.out.println("안비었음");
		}
		
		//전부 삭제
		list.clear();
		System.out.println(list.toString());
		if(list.isEmpty()) {
			System.out.println("비었음");
		} else {
			System.out.println("안비었음");
		}
		
		System.out.println("========================================================");
		
		//제네릭<?> = 제네릭에 어떤 타입이던 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들
		//제네릭<? super String> = String타입이 될 수 있다면 전달가능
		List<String> list2 = Arrays.asList("a","b","c","d");
		System.out.println(list2.toString());
		
		//리스트 병합
		list.addAll(list2);  
		System.out.println(list.toString());
		
		
		
	}
	
}






























