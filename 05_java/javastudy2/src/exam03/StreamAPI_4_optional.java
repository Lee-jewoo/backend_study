package exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAPI_4_optional {

	public static void main(String[] args) {
		
		// Optional(Int/Double/Long)
		// 컬렉션에 값이 없을 때 집계 메서드를 사용하면 예외 발생 -> 예외를 방지 + 기본값 설정 기능
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		OptionalDouble avg = list.stream().mapToDouble(n -> n).average();
		System.out.println(avg);
		System.out.println(avg.getAsDouble());
		System.out.println(avg.orElse(0.0));
		
		List<Integer> list2 = new ArrayList<Integer>();
		OptionalDouble avg2 = list2.stream().mapToDouble(n -> n).average();
		System.out.println(avg2);
		System.out.println(avg2.orElse(0.0));
		
		
	}

}
