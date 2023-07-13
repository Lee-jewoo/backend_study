package Test01;

public class Test14_1 {

	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(" " + i*j);
				if (j == 9) {
					System.out.println();
				}
			}
		}
	}

}
