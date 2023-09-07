package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_2_flatmap {

	public static void main(String[] args) {

		// flatMap(Function<T, Stream>)
		// 요소를 가공해 복수의 요소로 구성된 새로운 스트림 반환

		// 공백을 기준으로 분리
		// 익명클래스
		List<String> list = Arrays.asList("hello world", "happy day");
		Function<String, Stream<? extends String>> mapper = new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<? extends String> apply(String t) {
				String [] names = t.split(" ");
				return Arrays.stream(names);
			}
		};
		list.stream().flatMap(mapper).forEach(System.out::println);

		// 람다 표현식
		list.stream().flatMap(t-> Arrays.stream(t.split(" "))).forEach(System.out::println);
		
		// 쉼표를 기준으로 분리 + 정수값으로 출력
		// 익명클래스 -> 문자 배열을 정수배열로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		Function<String, IntStream> mapper2 = new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String [] arr = t.split(", ");
				int [] n = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
				return Arrays.stream(n);
			}
		};
		list2.stream().flatMapToInt(mapper2).forEach(System.out::println);
		
		// 람다 표현식
		list2.stream().flatMapToInt(t->Arrays.stream(Arrays.stream(t.split(", "))
					  .mapToInt(Integer::parseInt).toArray()))
					  .forEach(System.out::println);
		
	}

}
