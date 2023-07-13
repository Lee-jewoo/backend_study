package Test01;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("오른쪽 위가 직각인 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = num.nextInt();
		System.out.println(n);
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
