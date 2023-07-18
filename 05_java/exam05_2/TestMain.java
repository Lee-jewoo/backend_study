package exam05_2;

class Count{
	int n;
	static int m;
	public Count() {
		n++;
		m++;
	}
	
	// 인스턴스 메서드
	public void n_print() {
		System.out.println("인스턴스 변수 n : "+n);
		System.out.println("static 변수 m : "+m);
	}
	
	// static 메서드
	public static void m_print() {
//		System.out.println("인스턴스 변수 n : "+n); // 인스턴스 변수에 접근할 수 없음
//		System.out.println(this); // this에 접근할 수 없음
		System.out.println("static 변수 m : "+m);
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		// 객체 생성 전 static 사용 가능
		System.out.println(Count.m); // 0으로 자동 초기화
		Count.m_print();
		
		Count c1 = new Count();
		c1.n_print();
		Count c2 = new Count();
		c2.n_print();

	}

}
