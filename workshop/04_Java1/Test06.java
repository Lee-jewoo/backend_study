package Test01;

public class Test06 {

	public static void main(String[] args) {
		int n;
		int m;
		int k;
		for (n=1; n<=6; n++) {
			for (m=1; m<=6; m++) {
				for (k=1; k<=6; k++) {
					if ((n*m*k)%3 == 0) {
						System.out.println(n+"*"+m+"*"+k+" = "+(n*m*k));
					}
				}
			}
		}
	}

}
