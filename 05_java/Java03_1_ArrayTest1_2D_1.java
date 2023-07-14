package exam03;

import java.util.Arrays;

public class Java03_1_ArrayTest1_2D_1 {

	public static void main(String[] args) {
		// 2차원 배열 출력
		// index 이용
		int [][] n;
		n = new int [2][2];
		n[0][0] = 1;
		n[0][1] = 2;
		n[1][0] = 3;
		n[1][1] = 4;
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		System.out.println(n.length);
		System.out.println(n[0].length);
		System.out.println(n[1].length);
		
		// for 문
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++)
				System.out.println("for : " + n[i][j]);
		}
		
		// for each 문
		for (int [] i : n) {
			for (int j : i) {
				System.out.println("for-each : " + j);
			}
		}
		
		System.out.println(Arrays.deepToString(n));

	}

}
