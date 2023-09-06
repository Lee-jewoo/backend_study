package exam02;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// 파라미터 1개
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("Consumer : " + t);
			}
		};
		c.accept("춘식이");
		
		// 람다 표현식
		Consumer<String> c2 = t -> {System.out.println("람다 Consumer : " + t);};
		c2.accept("춘식이");
	
		// 익명클래스
		IntConsumer i = new IntConsumer() {
			@Override
			public void accept(int n) {
				System.out.println("IntConsumer : " + n);
			}
		};
		i.accept(10);
		
		// 람다 표현식
		IntConsumer i2 = n -> {System.out.println("람다 IntConsumer : " + n);};
		i2.accept(10);

	}

}
