package exam02;

public class Java01_6_ForTest {

	public static void main(String[] args) {
		for (int n = 1; n < 6; n++) {
			System.out.println("hello");
		}
		
		for (int n = 5; n > 0; n--) {
			System.out.println("world1");
		}
		for (int n = 1; n < 10; n+=2) {
			System.out.println("world2");
		}
		for (int n = 1, n2 = 1; n < 10; n+=2, n++) {
			System.out.println("world3");
		}

	}

}
