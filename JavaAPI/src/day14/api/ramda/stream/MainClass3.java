package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass3 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Random ran = new Random();

		for(int i = 0; i<100; i++) {

			list.add(ran.nextInt(1,100));
		}
		
		//최종집계 함수
		//collect() 
		
		List<Integer> newList = list.stream().filter(a -> a%3==0).collect(Collectors.toList());
		
		System.out.println(newList.toString());
		Set<Integer> setLi = list.stream().filter(a -> a%3==0).collect(Collectors.toSet());
		System.out.println(setLi.toString());
		
		System.out.println("==============================================================");
		//sum(), count(), avg(), max(), min(), reduce() - 숫자를 다루는 스트림에서만 사용

		int b= list.stream().distinct().mapToInt(a->a).sum();
		System.out.println(b);
		
		System.out.println(Arrays.toString(list.stream().distinct().mapToInt(a->a).toArray()));
		
		long r = list.stream().distinct().mapToInt(a->a).count();
		System.out.println(r);
		
		OptionalDouble od = list.stream().distinct().mapToInt(a->a).average();
		System.out.println(od.getAsDouble());
		
		OptionalInt oi = list.stream().distinct().mapToInt(a->a).max();
		System.out.println(oi.getAsInt());
		
		System.out.println("==============================================================");
		//list 에서 50보다 큰값만 중복 없이 저장하는 새로운 리스트생성
		List<Integer> an = list.stream().distinct().filter(a-> a>50).collect(Collectors.toList());
		System.out.println(an.toString());
		
		System.out.println("==============================================================");
		
		//a~b b미포함
		IntStream.range(1, 10).forEach(a->System.out.println(a));
		//a~b b포함
		IntStream.rangeClosed(1, 10).forEach(a->System.out.println(a));
		
		int re = IntStream.rangeClosed(1, 100).sum();
		System.out.println(re);
		
		//정수스트림 => 일반스트림 변환
		// boxed()
		Stream<Integer> st= IntStream.rangeClosed(1, 100).boxed();
		
		
		
	}
}











