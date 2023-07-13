package Test01;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		int hour = num.nextInt();
		System.out.print("월급 입력 : ");
		int pay = num.nextInt();
		System.out.println("===============");
		
		double bonus;
		if (hour >= 25) {
			bonus = pay;
		}else if (hour >= 20) {
			bonus = pay/10*8;
		} else if (hour >= 18) {
			bonus = pay/10*5;
		} else {
			bonus = 0;
		}
		System.out.println("보너스 : " + (int)bonus);
		System.out.println("지급될 급여 : " + (int)(bonus + pay));

		}
	
	}
