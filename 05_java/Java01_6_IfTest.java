package exam02;

import java.util.Scanner;

public class Java01_6_IfTest {

	public static void main(String[] args) {
		// 단일 if문
		System.out.println(1);
		if (true) System.out.println(2);
		if (false) {
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println("end");
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num = scan.nextInt();
		System.out.println("정수를 입력하시오.");
		int num2 = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println(num); // -> 입력값이 짝수이면 출력
		}
		System.out.println(num2);
		
	}

}
