package Test02;

import java.util.Random;

public class ArrayTest10 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		int [][] n = new int [row][col];
		double sum = 0;
		double average = 0;
		double avg;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (args.length !=2) {
			System.out.println("다시 입력하세요.");
		} else if (a<1 || a>5 || b<1 || b>5) {
			System.out.println("숫자를 확인하세요.");
		} else {
			for (int i=0; i<n.length; i++) {
				for (int j=0; j<n[i].length; j++) {
					n[i][j] = rand.nextInt(5)+1;
					sum += n[i][j];
				}
				average += n[i].length;
			}
			avg = sum / average;
			for (int [] i : n) {
				for (int j : i) {
					System.out.print(j+" ");
				}
				System.out.println("");
			}
			System.out.println("sum="+sum);
			System.out.println("avg="+avg);
		}
	}		
}
