package exam09;

class Test4{
	public void b() throws ArithmeticException {
		System.out.println("Test a");
			int n = 0;
			int m = 10/n;
			System.out.println("결과 " + m);
	}
	public void a() throws ArithmeticException {
		b();
	}
	
}

public class ExceptionTest5 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Test4 t = new Test4();
		try {
			t.a();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("정상종료");
		
	}

}
