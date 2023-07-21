package exam07_4;

// 인터페이스 생성
interface Y1 {
	final int NUM = 10;
	int SIZE = 20;
	public static final int COUNT = 30; // 권장
	
	public abstract void a1(); // 권장
	public void a2();
	void a3();
	
	public default void b() {
		System.out.println("default method");
	}
	
	public static void c() {
		System.out.println("static method");
	}
}

interface Y2 {
	public abstract void x();
}
interface Y3 {
	public abstract void x2();
}

class K implements Y2{

	@Override
	public void x() {
	}
	
}
// 다중 구현
class K2 implements Y2, Y3{
	
	@Override
	public void x() {
	}

	@Override
	public void x2() {
	}
	
}
// 인터페이스 간의 상속
interface Y4 extends Y2, Y3 {
	// 다중 상속 가능
}

// 상속과 구현
class K3 extends Object implements Y2, Y3{

	@Override
	public void x2() {
	}

	@Override
	public void x() {
	}
	
}

class Z implements Y1 {
	public void a1() {
		System.out.println("a1");
	}
	public void a2() {
		System.out.println("a2");
	}
	public void a3() {
		System.out.println("a3");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		K k = new K();
		k.x();
		
		//다형성
		Y2 y2 = new K();
		y2.x();
		
		Z z = new Z();
		z.a1(); // 추상메서드 재정의
		z.a2();
		z.a3();
		System.out.println(Y1.NUM); // 상수
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b(); // default method
		Y1.c(); // static method

	}

}
