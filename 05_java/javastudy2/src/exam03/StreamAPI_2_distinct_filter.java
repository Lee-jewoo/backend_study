package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI_2_distinct_filter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("춘식이", "라이언", "죠르디", "춘식이");
		
		// 중간 처리 : 중복 제거
		list.stream().distinct().forEach(System.out::println);
		
		// 중간 처리 : 필터링
		// 익명클래스
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("춘");
			}
		};
		list.stream().filter(predicate).forEach(System.out::println);
		
		// 람다 표현식
		list.stream().filter(t->t.startsWith("춘")).forEach(System.out::println);
		
		// 중간 처리 : 중복 제거 + 필터링
		list.stream().distinct()
					 .filter(t->t.startsWith("춘"))
					 .forEach(System.out::println);
		
	}

}
