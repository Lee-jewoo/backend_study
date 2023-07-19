package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		String result = String.format("이름 : %s, 나이 : %d, 키 : %.2f, 성별 : %c, 존재 : %b", "춘식이", 10, 100.3333333, '남', true);
		System.out.println(result);
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.2f, 성별 : %c, 존재 : %b", "춘식이", 10, 100.3333333, '남', true);
		System.out.printf("\n이름 : %s, 나이 : %d, 키 : %.2f, 성별 : %c, 존재 : %b", "춘식이", 10, 100.3333333, '남', true);

	}

}
