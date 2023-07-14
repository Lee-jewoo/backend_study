package exam02;

public class Java01_6_SwitchTest {

	public static void main(String[] args) {
		// switch문
		int num = 10;
		switch (num) {
		case 5: System.out.println("5"); break;
		case 10: System.out.println("10"); break;
		case 15: System.out.println("15"); break;
		default: System.out.println("default");
		}
		
		char c = 'A';
		switch (c) {
		case 'A': System.out.println("A"); break;
		case 'B': System.out.println("B"); break;
		default: System.out.println("default");
		}
		
		String s = "B";
		switch (s) {
		case "A": System.out.println("A"); break;
		case "B": System.out.println("B"); break;
		default: System.out.println("default");
		}

	}

}
