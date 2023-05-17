package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		//HashSet<Integer> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add() 
		//중복을 허용하지 않는다.
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); // 2번 저장되지 않는다.
		
		System.out.println(set.toString());
		
		//크기 확인
		System.out.println(set.size());
		
		//제거
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 => 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println("==============================================");
		
		//set => iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
		//iterator 타입으로 바꾸고 next() StringTokenizer 와 유사
		/*
		System.out.println(iter.next()+"1");
		System.out.println(iter.next()+"2");
		System.out.println(iter.next()+"3");
		System.out.println(iter.next()+"4");
		*/
		while(iter.hasNext()) { //다음이 있으면 true, 없으면 false 
			System.out.println(iter.next());
		}
		
		
		
		
		
		
	}
}













