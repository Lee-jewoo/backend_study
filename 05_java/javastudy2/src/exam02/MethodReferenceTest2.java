package exam02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Calculator2 {
	
	public int methodA(int n, int m) {
		return n+m;
	}

}

public class MethodReferenceTest2 {

	public static void main(String[] args) {
		
		// 인스턴스 메서드 참조
		// 파라미터 O 리턴 O
		// 익명클래스
		Calculator2 c = new Calculator2();
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer n, Integer m) {
				return c.methodA(n, m);
			}
		};
		
		// 람다 표현식
		BinaryOperator<Integer> b2 = (n, m) -> c.methodA(n, m);
		
		// 메서드 참조
		BinaryOperator<Integer> b3 = c::methodA;
		System.out.println(b3.apply(10, 20));
		
		// API 클래스 -> String 클래스의 인스턴스 메서드 사용
		// 익명클래스
		UnaryOperator<String> u = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		
		// 람다 표현식
		UnaryOperator<String> u2 = t -> t.toUpperCase();
		
		// 메서드 참조
		UnaryOperator<String> u3 = String::toUpperCase;
		System.out.println(u3.apply("hello"));
		
	}

}
