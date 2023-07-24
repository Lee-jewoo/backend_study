package exam09;

class Test3{
	public void a() {
		System.out.println("Test a");
		try {
			int n = 2;
			int m = 10/n;
			System.out.println("결과 " + m);
			
			String s = null;
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("객체를 생성하지 않았습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("무조건 실행");
		}
	}
}

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Test3 t = new Test3();
		t.a();
		System.out.println("정상종료");
		
	}

}
