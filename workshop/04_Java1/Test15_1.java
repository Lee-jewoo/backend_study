package Test01;

import java.util.Scanner;

public class Test15_1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = num.nextInt();
		System.out.println(n);
		String s = "";
		
		for (int i = 1; i <= n; i++) {
			s += "*";
			System.out.println(s);
		}
	
	}

}
