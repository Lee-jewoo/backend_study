package Test01;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오.");
		int num = scan.nextInt();
		System.out.println(num);
		int sum = 0;
		String s = "";
		for (int i=1; i<=100; i++) {
			if (i%num == 0) {
				sum += i;
				if (i != num) {
					System.out.print("+");
				}
				System.out.print(i);
			}
		}
		System.out.println(" = "+sum);

	}

}
