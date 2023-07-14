package exam02;

public class Java01_1_PDT_DataType {

	public static void main(String[] args) {
		// 문자 리터럴 -> char 기본형 데이터
		System.out.println('A');
		System.out.println('이');
		
		// 문자열 -> String 참조형
		System.out.println("춘식이");
		
		// escape 문자
		System.out.println("춘식\n이"); // 줄바꿈
		System.out.println("춘식\t이"); // 탭
		System.out.println("춘식\'이"); // '
		System.out.println("춘식\"이"); // "
		System.out.println("춘식\\이"); // \
		
		// 정수 리터럴
		System.out.println(10); // 10진수 10
		System.out.println(0b01); // 2진수 1
		System.out.println(01); // 8진수 1
		System.out.println(0x0); // 16진수 0
		System.out.println(0xA); // 16진수 10
		System.out.println(0xF); // 16진수 15
		System.out.println(2147483647); // int의 저장 범위 (4byte)
		System.out.println(2147483648L); // int의 저장 범위 밖이면 L(long) 지정
		System.out.println(-2147483648); // int의 저장 범위 (4byte)
		
		// 실수 리터럴
		System.out.println(3.14); // double
		System.out.println(3.14d); // double
		System.out.println(3.14f); // float
		System.out.println(2e3); // float
		
		// 논리 리터럴
		System.out.println(true);
		System.out.println(false);
		
	}

}
