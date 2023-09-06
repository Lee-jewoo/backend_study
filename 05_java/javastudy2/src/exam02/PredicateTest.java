package exam02;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		// 익명클래스
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.length()==3;
			}
		};
		System.out.println("Predicate : "+p.test("춘식이"));
		
		// 람다 표현식
		Predicate<String> p2 = s -> s.length()==3;
		System.out.println("람다 Predicate : "+p2.test("춘식이"));
		
		// 익명클래스
		IntPredicate i = new IntPredicate() {
			@Override
			public boolean test(int n) {
				return n>10;
			}
		};
		System.out.println("IntPredicate : "+i.test(5));
		
		// 람다 표현식
		IntPredicate i2 = n -> n>10;
		System.out.println("람다 IntPredicate : "+i2.test(5));
		
		// 파라미터 2개
		// 익명클래스
		BiPredicate<String, Integer> b = new BiPredicate<String, Integer>() {
			@Override
			public boolean test(String s, Integer n) {
				return s.length()==n;
			}
		};
		System.out.println("BiPredicate : "+b.test("춘식이", 3));
		
		// 람다 표현식
		BiPredicate<String, Integer> b2 = (s, n) -> s.length()==n;
		System.out.println("람다 BiPredicate : "+b2.test("춘식이", 3));
		
	}

}
