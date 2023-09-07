package exam03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPI_2_boxed_asStream {

	public static void main(String[] args) {
		
		// boxed : 기본형을 참조형으로 변환
		int [] arr = {1, 2, 3, 4, 5};
		IntStream s = Arrays.stream(arr);
		s.boxed().forEach(System.out::println);
		
		// asDoubleStream : IntStream -> DoubleStream 변환
		Arrays.stream(arr).asDoubleStream().forEach(System.out::println);
	
	}

}
