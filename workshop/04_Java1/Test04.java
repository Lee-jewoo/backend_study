package Test01;

public class Test04 {

	public static void main(String[] args) {
		int n;
		int m;
		for (n = 1; n <= 6; n++) {
			for (m = 1; m <= 6; m++) {
				if (n + m == 6) {
					System.out.println(n + "+" + m + "=" + (n+m));
				}
			}
		}
	}

}
