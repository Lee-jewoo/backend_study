package Test01;

import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int a;
		do {
			a = num.nextInt();
			System.out.println("정수값 : " + a);
		} while (a <= 0);
		
		String s = ""+a;
		System.out.println("그 수는 "+ s.length() + "자리입니다.");

	}

}
