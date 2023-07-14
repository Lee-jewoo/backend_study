package exam02;

public class Java01_5_OperatorTest1 {

	public static void main(String[] args) {
		int n = 10;
		int m = 3;
		// 산술 연산자
		System.out.println(n + m); // 13
		System.out.println(n - m); // 7
		System.out.println(n * m); // 30
		System.out.println(n / m); // 3
		System.out.println(n / 3.0); // 3.3333333333333335
		System.out.println(n % m); // 1
		
		String s = 10 + 20 + 30 + "hello";
		String s2 = "hello" + 10 + 20 + 30;
		System.out.println(s);
		System.out.println(s2);
		
	}

}
