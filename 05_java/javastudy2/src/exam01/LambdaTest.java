package exam01;

// 인터페이스
interface Flyer {
	// 1. 파라미터 X 리턴값 X
	public void fly();
}

public class LambdaTest {
	
	public static void main(String[] args) {
		
		// 익명클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("Flyer fly()");
			}
		};
		f.fly();
		
		// 람다 표현식
		Flyer f2 = () -> {System.out.println("람다 Flyer fly()");};
		f2.fly();
		
	}

}
