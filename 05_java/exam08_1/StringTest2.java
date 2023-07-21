package exam08_1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		// String 클래스의 인스턴스 메서드
		String s = "hELLo";
		System.out.println(s.length()); // 문자열의 길이
		System.out.println(s.charAt(1)); // 특정 위치의 문자
		System.out.println(s.indexOf("E")); // 특정 문자의 위치
		System.out.println(s.toUpperCase()+s.toLowerCase()); // 대소문자로 변환
		System.out.println(s.concat("@@@")); // 문자열 연결
		System.out.println(s.substring(1, 4)); // 부분열
		System.out.println(s.contains("hE")); // 문자열 포함 여부
		System.out.println(s.replace("L", "w")); // 치환
		System.out.println(s.equals("hello")); // 문자열 비교
		System.out.println(s.equalsIgnoreCase("hello")); // 문자열 비교 (대소문자 무시)
		String t = "     world     ";
		System.out.println(t.trim()); // 앞뒤 공백 제거
		String r = "AAA/BBB/CCC";
		String [] arr = r.split("/");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(r.split("/")));
		
		// String 클래스의 static 메서드
		System.out.println(String.format("이름 : %s, 나이 : %d", "춘식이", 10)); // 포맷 지정
		System.out.println(String.valueOf(10)); // 문자열로 변환
		System.out.println(s); // 문자열 원본은 변경되지 않음 -> 새로운 문자열이 생성

	}

}
