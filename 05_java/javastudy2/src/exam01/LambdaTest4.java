package exam01;

// 인터페이스
interface Flyer4 {
	// 4. 파라미터 O 리턴값 O
	public int fly(int n, int m);
}

public class LambdaTest4 {
	
	public static void main(String[] args) {
		
		// 익명클래스
		Flyer4 f = new Flyer4() {
			@Override
			public int fly(int n, int m) {
				return n+m;
			}
		};
		System.out.println(f.fly(10, 20));
		
		// 람다 표현식
		Flyer4 f2 = (int n, int m) -> {return n+m;};
		System.out.println(f2.fly(10, 20));
		
		// 데이터 타입을 생략할 수 있음
		Flyer4 f3 = (n, m) -> {return n+m;};
		System.out.println(f3.fly(10, 20));
		
		// return만 있으면 {}와 return을 생략할 수 있음
		Flyer4 f4 = (n, m) -> n+m;
		System.out.println(f4.fly(10, 20));
		
	}

}
