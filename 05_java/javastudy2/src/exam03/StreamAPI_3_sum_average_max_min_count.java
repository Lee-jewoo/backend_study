package exam03;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class StreamAPI_3_sum_average_max_min_count {

	public static void main(String[] args) {
		
		// 최종처리 : 통계처리
		// IntStream, DoubleStream, LongStream의 메서드
		// sum : 합계 / average : 평균 / max : 최대 / min : 최소 / count : 개수
		
		int [] arr = {1, 2, 3, 4, 5};
		int sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
		double avg = Arrays.stream(arr).filter(n -> n%2==0).average().orElse(0.0);
		int max = Arrays.stream(arr).filter(n -> n%2==0).max().orElse(0);
		int min = Arrays.stream(arr).filter(n -> n%2==0).min().orElse(0);
		long count = Arrays.stream(arr).filter(n -> n%2==0).count();
		
		System.out.println(Arrays.stream(arr).sum());
		System.out.println("짝수 합 : "+sum);
		System.out.println(Arrays.stream(arr).average().orElse(0.0));
		System.out.println("짝수 평균 : "+avg);
		System.out.println(Arrays.stream(arr).max().orElse(0));
		System.out.println("짝수 최대 : "+max);
		System.out.println(Arrays.stream(arr).min().orElse(0));
		System.out.println("짝수 최소 : "+min);
		System.out.println(Arrays.stream(arr).count());
		System.out.println("짝수 개수 : "+count);
		
	}

}
