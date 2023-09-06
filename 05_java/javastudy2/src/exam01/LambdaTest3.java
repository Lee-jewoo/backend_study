package exam01;

// 인터페이스
interface Flyer3 {
	// 2. 파라미터 2개 리턴값 X
	public void fly(int n, String s);
}

public class LambdaTest3 {
	
	public static void main(String[] args) {
		
		// 익명클래스
		Flyer3 f = new Flyer3() {
			@Override
			public void fly(int n, String s) {
				System.out.println("Flyer fly(int n, String s) " + n + s);
			}
		};
		f.fly(10, "춘식이");
		
		// 람다 표현식
		Flyer3 f2 = (int n, String s) -> {System.out.println("람다 표현식 Flyer fly(int n, String s) " + n + s);};
		f2.fly(10, "춘식이");
		// 데이터 타입을 생략할 수 있음
		Flyer3 f3 = (n, s) -> {System.out.println("람다 표현식 Flyer fly(int n, String s) " + n + s);};
		f3.fly(10, "춘식이");
		
	}

}
