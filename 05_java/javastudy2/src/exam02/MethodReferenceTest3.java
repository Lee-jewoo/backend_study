package exam02;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Calculator3 {
	
	public static int methodA(int n, int m) {
		return n+m;
	}

}

public class MethodReferenceTest3 {

	public static void main(String[] args) {
		
		// static 메서드 참조
		// 파라미터 O 리턴 O
		// 익명클래스
		Calculator3 c = new Calculator3();
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer n, Integer m) {
				return Calculator3.methodA(n, m);
			}
		};
		
		// 람다 표현식
		BinaryOperator<Integer> b2 = (n, m) -> Calculator3.methodA(n, m);
		
		// 메서드 참조
		BinaryOperator<Integer> b3 = Calculator3::methodA;
		System.out.println(b3.apply(10, 20));
		
		// API의 static 메서드 -> Integer.parseInt()
		// 익명클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		
		// 람다 표현식
		Function<String, Integer> f2 = t -> Integer.parseInt(t);
		
		// 메서드 참조
		Function<String, Integer> f3 = Integer::parseInt;
		System.out.println(f3.apply("10"));
		
	}

}
