package Test02;

import java.util.Random;

public class ArrayTest09 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr3 = new int[5];
		for (int i=0; i<arr3.length; i++) {
			arr3[i] = rand.nextInt(11);
			if (i==(arr3.length-1)) {
				System.out.println(arr3[i]);
				break;
			}
			System.out.print(arr3[i]+" ");
		}
		double sum = 0;
		for (int i=0; i < arr3.length; i++) {
			sum += arr3[i];
		}
		double avg = sum / arr3.length;
		System.out.println("sum="+(int)sum);
		System.out.println("avg="+avg);
	}		
}
