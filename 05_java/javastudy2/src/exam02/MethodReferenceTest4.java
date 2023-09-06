package exam02;

import java.util.function.Consumer;

public class MethodReferenceTest4 {

	public static void main(String[] args) {
		
		// System.out.println 메서드 참조
		// 파라미터 O 리턴 X
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		// 람다 표현식
		Consumer<String> c2 = t -> System.out.println(t);
		
		// 메서드 참조
		Consumer<String> c3 = System.out::println; // 많이 사용
		c3.accept("춘식이");
		
	}

}
