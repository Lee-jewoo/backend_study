package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Calculator {

	public Calculator() {
		System.out.println("Calculator 기본생성자");
	}
	
	public Calculator(int n) {
		System.out.println("Calculator (int n)");
	}
	
	public Calculator(int n, String t) {
		System.out.println("Calculator (int n, String t)");
	}
	
}

public class MethodReferenceTest {

	public static void main(String[] args) {
		
		// 생성자 메서드 참조
		// 파라미터 X 리턴 O -> 기본생성자 / Supplier
		// 익명클래스
		Supplier<Calculator> s = new Supplier<Calculator>() {
			@Override
			public Calculator get() {
				return new Calculator();
			}
		};
		
		// 람다 표현식
		Supplier<Calculator> s2 = () -> new Calculator();
		
		// 메서드 참조
		Supplier<Calculator> s3 = Calculator::new;
		Calculator c = s3.get();
		System.out.println(c);
		
		// 파라미터  1개 리턴 O
		// 익명클래스
		Function<Integer, Calculator> f = new Function<Integer, Calculator>() {
			@Override
			public Calculator apply(Integer n) {
				return new Calculator(n);
			}
		};
		
		// 람다 표현식
		Function<Integer, Calculator> f2 = n -> new Calculator(n);
		
		// 메서드 참조
		Function<Integer, Calculator> f3 = Calculator::new;
		Calculator c2 = f3.apply(10);
		System.out.println(c2);

		// 파라미터  2개 리턴 O
		// 익명클래스
		BiFunction<Integer, String, Calculator> b = new BiFunction<Integer, String, Calculator>() {
			@Override
			public Calculator apply(Integer n, String s) {
				return new Calculator(n, s);
			}
		};
		
		// 람다 표현식
		BiFunction<Integer, String, Calculator> b2 = (n, t) -> new Calculator(n, t);
		
		// 메서드 참조
		BiFunction<Integer, String, Calculator> b3 = Calculator::new;
		Calculator c3 = b3.apply(10, "춘식이");
		System.out.println(c3);
		
	}

}
