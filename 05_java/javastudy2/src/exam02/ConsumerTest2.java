package exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest2 {

	public static void main(String[] args) {
		// 파라미터 2개
		// 익명클래스
		BiConsumer<String, Integer> x = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String s, Integer n) {
				System.out.println("BiConsumer : "+ s + n);
			}
		};
		x.accept("춘식이", 10);
		
		// 람다 표현식
		BiConsumer<String, Integer> x2 = (s, n) -> {System.out.println("람다 BiConsumer : "+ s + n);};
		x2.accept("춘식이", 10);
	
		// 익명클래스
		ObjIntConsumer<String> y = new ObjIntConsumer<String>() {
			@Override
			public void accept(String s, int n) {
				System.out.println("ObjIntConsumer : "+ s + n);
			}
		};
		y.accept("춘식이", 10);
		
		// 람다 표현식
		ObjIntConsumer<String> y2 = (s, n) -> {System.out.println("람다 ObjIntConsumer : "+ s + n);};
		y2.accept("춘식이", 10);

	}

}
