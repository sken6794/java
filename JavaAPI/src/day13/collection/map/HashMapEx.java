package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		//Map인터페이스를 구현하는 클래스 HashMap
		//키 타입과 value 타입을 지정 
		//탐색이 빠르다는 장점이 있음.
		
		
		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//맵에 값을 저장 put(키, 값)
		map.put(2, "길동무");
		map.put(1, "홍당무");
		map.put(4, "김짜샤");
		map.put(33, "김도도");
		
		//map의 값들만 확인
		System.out.println(map.values());
		//map의 키와 값을 확인
		System.out.println(map.toString());
		
		//기존 키에 값이 있는 경우 덮어쓰기가 된다.
		map.put(2, "사과");
		System.out.println(map.toString());
		
		//맵의 값을 얻기 get(key) : 값을 반환
		System.out.println(map.get(2));
		
		//key의 유무 확인 containsKey(key)
		if(map.containsKey(2)) {
			System.out.println(2+" 번 키가 존재 함");
		}
		
		//map의 삭제 remove(Key)
		System.out.println("삭제된 값 : " +map.remove(2));
		System.out.println(map.toString());
		
		//map의 순회
		//map.entrySet() => map을 set 으로 변경
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("키 : "+entry.getKey()+", 값 : "+entry.getValue());
		}
		
		/*
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		*/
		System.out.println("=================================================");
		Set<Integer> set = map.keySet(); //키만 꺼내서 set에 저장
		
		for (int key : set) {
			System.out.println("키 : " + key);
			System.out.println("값 "+map.get(key));
		}
		
		
		System.out.println("=================================================");
		
		//map에 객체를 담는 모형
		//Map<Integer, User> map2 = new HashMap<>();
		//Map<Integer, Object> map2 = new HashMap<>();
		System.out.println(map.toString());
	}
	
	
}





