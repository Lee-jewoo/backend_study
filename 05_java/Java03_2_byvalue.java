package exam03;

import java.util.Arrays;

public class Java03_2_byvalue {
	
	// 기본형 인자
	private static void pdt(int n) {
		System.out.println("pdt : " + n); // 10
		n = 20;
		System.out.println("pdt : " + n); // 20
	}
	
	// 참조형 인자
	private static void rdt(int [] m) {
		System.out.println("rdt : " + Arrays.toString(m));
		m[0] = 100;
		System.out.println("rdt : " + Arrays.toString(m));
	}

	public static void main(String[] args) {
		// 기본형 데이터
		int n = 10;
		System.out.println("호출 전 : " + n); // 10
		pdt(n);
		System.out.println("호출 후 : " + n); // 10
		
		// 참조형 데이터
		int [] m = {10, 20, 30};
		System.out.println("호출 전 : " + Arrays.toString(m));
		rdt(m);
		System.out.println("호출 후 : " + Arrays.toString(m));

	}

}
