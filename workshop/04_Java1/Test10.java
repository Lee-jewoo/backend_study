package Test01;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기");
		int n = num.nextInt();
		int sum = 0;
		do {
			System.out.println("n 값: "+n);
			n = num.nextInt();
		} while (n <= 0);
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1부터 "+n+" 까지의 총합: "+sum);
	}

}
