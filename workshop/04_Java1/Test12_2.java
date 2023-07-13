package Test01;

import java.util.Scanner;

public class Test12_2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int n;
		int cnt = 0;
		do {
			n = num.nextInt();
			System.out.println("정수값 : " + n);
		} while (n <= 0);
		
		while (n > 0) {
			n /= 10;
			cnt++;
		}
		System.out.println("그 수는 "+ cnt + "자리입니다.");

	}

}
