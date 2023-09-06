package exam01;

// 인터페이스
interface Flyer2 {
	// 2. 파라미터 1개 리턴값 X
	public void fly(int n);
}

public class LambdaTest2 {
	
	public static void main(String[] args) {
		
		// 익명클래스
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
				System.out.println("Flyer fly(int n) " + n);
			}
		};
		f.fly(10);
		
		// 람다 표현식
		Flyer2 f2 = (int n) -> {System.out.println("람다 표현식 Flyer fly(int n) " + n);};
		f2.fly(10);
		// 데이터 타입을 생략할 수 있음
		Flyer2 f3 = (n) -> {System.out.println("람다 표현식 Flyer fly(int n) " + n);};
		f3.fly(10);
		// 파라미터가 하나면 () 생략할 수 있음
		Flyer2 f4 = n -> {System.out.println("람다 표현식 Flyer fly(int n) " + n);};
		f4.fly(10);
		
	}

}
