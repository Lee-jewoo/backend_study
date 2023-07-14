package exam02;

public class Java01_5_OperatorTest5 {

	public static void main(String[] args) {
		// 증감 연산자
		
		int n = 10;
		++n;
		System.out.println(n); // 전치 11
		
		int m = 10;
		n--;
		System.out.println(m); // 후치 10
		
		int i = 10;
		int result = ++i;
		System.out.println(i + "\t" + result); // 전치 11, 11
		
		int j = 10;
		int result2 = j++;
		System.out.println(j + "\t" + result2); //  후치 11, 10
		
		// 메서드 호출
		System.out.println(a()); // 전치 11
		System.out.println(a2()); // 후치 10
	}
	public static int a() {
		int x = 10;
		return ++x;
	}
	public static int a2() {
		int x = 10;
		return x++;
	}

}
