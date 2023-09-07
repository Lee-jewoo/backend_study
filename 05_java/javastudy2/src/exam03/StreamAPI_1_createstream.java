package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI_1_createstream {

	public static void main(String[] args) {
		
		// 스트림 생성
		// 컬렉션에서 생성
		List<String> list = Arrays.asList("춘식이", "라이언", "죠르디");
		Stream<String> s = list.stream();
		System.out.println("스트리 요소의 개수 : "+s.count());
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		list.stream().forEach(c);
		
		// 람다 표현식
		list.stream().forEach(t->System.out.println(t));
		
		// 메서드 참조
		list.stream().forEach(System.out::println);
		
		// 배열에서 생성
		String [] names = {"춘식이", "라이언", "죠르디"};
		Stream<String> x = Stream.of(names);
		x.forEach(System.out::println);
		
		Stream<String> x2 = Arrays.stream(names);
		x2.forEach(System.out::println);
		
		// 리터럴에서 생성
		Stream<String> y = Stream.of("춘식이", "라이언", "죠르디");
		y.forEach(System.out::println);
		
		Stream<Integer> y2 = Stream.of(10, 20, 30);
		y2.forEach(System.out::println);
		
	}

}
