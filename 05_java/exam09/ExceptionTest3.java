package exam09;

class Test2{
	public void a() {
		System.out.println("Test a");
		try {
			int n = 0;
			int m = 10/n;
			System.out.println("결과 " + m);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); // 예외 발생 사유 출력
			e.printStackTrace(); // 예외가 발생했을 때 디버깅용으로 사용
		}
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Test2 t = new Test2();
		t.a();
		System.out.println("정상종료");

	}

}
