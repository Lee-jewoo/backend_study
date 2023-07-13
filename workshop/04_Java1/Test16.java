package Test01;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("왼쪽 위가 직각인 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = num.nextInt();
		System.out.println(n);
		
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
