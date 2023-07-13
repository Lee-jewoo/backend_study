package Test01;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.println("a 값: ");
		int a = num.nextInt();
		System.out.println("b 값: ");
		int b = num.nextInt();
		System.out.println("c 값: ");
		int c = num.nextInt();
		
		int max = 0;
		if (max < a) {
			max = a;
			if (max < b) {
				max = b;
				if(max < c) {
					max = c;
				}
			}
			System.out.println("최대값: "+ max);
		}

	}
}
