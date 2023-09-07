package exam03;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class StreamAPI_3_Match {

	public static void main(String[] args) {
		
		// xxxMatch : 최종 처리에서 요소들의 조건 만족 여부 확인 / 리턴값 boolean
		
		int [] arr = {1, 2, 3, 4, 5};
		
		// allMatch(Predicate) : 모드 요소가 일치하는지 확인 
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int n) {
				return n<10;
			}
		};
		boolean resultall = Arrays.stream(arr).allMatch(predicate);
		System.out.println("allMatch : " + resultall);
		resultall = Arrays.stream(arr).allMatch(n -> n<10);
		System.out.println("람다 allMatch : " + resultall);

		// anyMatch(Predicate) : 일부 요소가 일치하는지 확인
		boolean resultany = Arrays.stream(arr).anyMatch(n -> n%3==0);
		System.out.println("람다 anyMatch : "+resultany);
		
		// noneMatch(Predicate) : 모드 요소가 일치하지 않는지 확인
		boolean resultnone = Arrays.stream(arr).noneMatch(n -> n%2!=0);
		System.out.println("람다 noneMatch : "+resultnone);
		
	}

}
