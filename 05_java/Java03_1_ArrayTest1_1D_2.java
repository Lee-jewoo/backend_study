package exam03;

public class Java03_1_ArrayTest1_1D_2 {

	public static void main(String[] args) {
		// 1차원 배열 생성 방법 2 리터럴 이용
		int [] n = {10, 20, 30};
		System.out.println(n[0]);
		n[1] = 200; // 값 변경
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n.length);
		
		String [] s = {"춘식이", "라이언"};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s.length);
		
	}

}
