package exam02;

public class Java01_6_IfTest3 {

	public static void main(String[] args) {
		// 다중 if문
		int num = 90;
		if (num >= 90) {
			System.out.println("A 학점");
		} else if (num >= 80) {
			System.out.println("B 학점");
		} else if (num >= 70) {
			System.out.println("C 학점");
		} else if (num >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}
	}

}
