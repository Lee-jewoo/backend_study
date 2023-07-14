package exam03;

import java.util.Arrays;

public class Java03_1_ArrayTest1_1D_4 {

	public static void main(String[] args) {
		// 배열 출력
		// index 이용
		int [] n = new int [] {10, 20, 30};
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		// 반복문 이용
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		// for each문 이용
		for (int i : n) {
			System.out.println(i);
		}
		// 배열을 문자열로 출력 (java.util.Arrays 클래스 이용)
		System.out.println(Arrays.toString(n));
		
	}

}
