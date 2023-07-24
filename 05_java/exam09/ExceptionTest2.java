package exam09;

class Test{
	public void a() {
		System.out.println("Test a");
		int n = 0;
		int m = 10/n; // 예외 발생 -> 비정상종료
		System.out.println("결과 " + m);
	}
}

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Test t = new Test();
		t.a();
		System.out.println("정상종료");
		
	}

}
