package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Random r1 = new Random();

		for (int i=0; i<10; i++) {
			list1.add(r1.nextInt(10));
			list2.add(r1.nextInt(10));
			try {
				System.out.print(list1.get(i)+"/"+list2.get(i) + " ");
				System.out.println(list1.get(i)/list2.get(i));
			} catch (ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
		
	}

}
