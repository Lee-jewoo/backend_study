package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionTest {

	public static void main(String[] args) {
		// 파라미터 1개
		// 익명클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println("Function : "+f.apply("춘식이"));
		
		// 람다 표현식
		Function<String, Integer> f2 = t -> t.length();
		System.out.println("람다 Function : "+f2.apply("춘식이"));
		
		// 익명 클래스
		IntFunction<Integer> x = new IntFunction<Integer>() {
			@Override
			public Integer apply(int n) {
				return n*2;
			}
		};
		System.out.println("IntFunction : "+x.apply(5));
		
		// 람다 표현식
		IntFunction<Integer> x2 = n -> n*2;
		System.out.println("람다 IntFunction : "+x2.apply(5));
		
		// 파라미터 2개
		// 익명클래스
		BiFunction<String, Integer, String> b = new BiFunction<String, Integer, String>() {
			@Override
			public String apply(String s, Integer n) {
				return s.substring(0, n);
			}
		};
		System.out.println("BiFunction : "+b.apply("춘식이", 2));
		
		// 람다 표현식
		BiFunction<String, Integer, String> b2 = (s, n) -> s.substring(0, n);
		System.out.println("람다 BiFunction : "+b2.apply("춘식이", 2));
		
	}

}
