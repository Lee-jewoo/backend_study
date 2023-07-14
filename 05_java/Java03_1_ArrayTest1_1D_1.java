package exam03;

public class Java03_1_ArrayTest1_1D_1 {

	public static void main(String[] args) {
		// 1차원 배열 생성 방법 1 new 이용
		int [] n;
		n = new int [3];
		n[0] = 10;
		n[1] = 20;
		
		System.out.println(n[0]); // 자동으로 초기화 = 0
		System.out.println(n[1]); //
		System.out.println(n[2]);
//		System.out.println(n[3]); // error
		
		String [] s = new String[3];
		s[0] = "춘식이";
		System.out.println(s[0]);
		System.out.println(s[1]);

	}

}
