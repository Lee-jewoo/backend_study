package Test02;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int n = sc.nextInt();
		int [] height = new int [n];
		for (int i=0; i<n; i++) {
			System.out.println("사람 "+(i+1)+" : ");
			height[i] = rand.nextInt(250);
			System.out.println(height[i]);
		}
		int max = 0;
		for (int i=0; i<height.length; i++) {
			if (max < height[i]) {
				max = height[i];
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
	}

}
