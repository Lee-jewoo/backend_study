package exam08_1;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder를 이용한 메서드
		StringBuilder sb = new StringBuilder("hELLo");
		System.out.println(sb);
		System.out.println(sb.append("world")); // 문자열 더하기
		System.out.println(sb.insert(0, "hello")); // 문자열 삽입
		System.out.println(sb.delete(0, 5)); // 문자열 삭제
		System.out.println(sb.reverse()); // 문자열 뒤집기
		System.out.println(sb.substring(1, 6)); // 부분열
		System.out.println(sb.charAt(0)); // 특정 위치의 문자
		System.out.println(sb.indexOf("h")); // 특정 문자의 위치 
		System.out.println(sb.replace(0, 6, "hello")); // 치환
		System.out.println(sb); // 버퍼로 동작 -> 문자열의 원본이 변경
		String s = sb.toString(); // 문자열로 변환
		System.out.println(s);

	}

}
