package exam02;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
		
		// 파라미터 1개
		// 익명클래스
		UnaryOperator<String> x = new UnaryOperator<String>() {
			@Override
			public String apply(String s) {
				return s+"~";
			}
		};
		System.out.println("UnaryOperator : "+x.apply("춘식이"));
		
		// 람다 표현식
		UnaryOperator<String> x2 = s -> s+"~";
		System.out.println("람다 UnaryOperator : "+x2.apply("춘식이"));
		
		// 익명클래스
		IntUnaryOperator y = new IntUnaryOperator() {
			@Override
			public int applyAsInt(int n) {
				return n*2;
			}
		};
		System.out.println("IntUnaryOperator : "+y.applyAsInt(5));
		
		// 람다 표현식
		IntUnaryOperator y2 = n -> n*2;
		System.out.println("람다 IntUnaryOperator : "+y2.applyAsInt(5));
		
		// 파라미터 2개
		// 익명클래스
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer n, Integer m) {
				return n+m;
			}
		};
		System.out.println("BinaryOperator : "+b.apply(2, 3));
		
		// 람다 표현식
		BinaryOperator<Integer> b2 = (n, m) -> n+m;
		System.out.println("람다 BinaryOperator : "+b2.apply(2, 3));

	}

}
