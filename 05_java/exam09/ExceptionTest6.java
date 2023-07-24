package exam09;

class Test5{
	public void b() throws ArithmeticException, NullPointerException {
		System.out.println("Test a");
			int n = 0;
			int m = 10/n;
			System.out.println("결과 " + m);
			
			String s = null;
			System.out.println(s.length());
	}
	public void a() throws ArithmeticException, NullPointerException {
		b();
	}
	
}

public class ExceptionTest6 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Test5 t = new Test5();
		try {
			t.a();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("객체를 생성하지 않았습니다.");
		} catch (Exception e ) {
			System.out.println("예외 발생");
		}
		System.out.println("정상종료");
		
	}

}
