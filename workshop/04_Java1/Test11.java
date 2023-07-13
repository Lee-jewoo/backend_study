package Test01;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = num.nextInt();
		int b;
		do {
			System.out.println(a+"보다 큰 값을 입력하세요!");
			b = num.nextInt();
		} while (a > b);
		System.out.println("b의 값 : " + b);
		System.out.println("b - a는 "+ (b-a)+"입니다.");
	}

}
