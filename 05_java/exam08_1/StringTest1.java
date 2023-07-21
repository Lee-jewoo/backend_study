package exam08_1;

public class StringTest1 {

	public static void main(String[] args) {
		// 리터럴 이용 -> 동일한 문자열이면 재사용
		String s1 = "hello";
		String s2 = "hello";
		// new 이용 -> 동일한 문자열이어도 재사용
		String t1 = new String("hello");
		String t2 = new String("hello");
		
		System.out.println(s1==s2); // 주소값이 같음
		System.out.println(t1==t2); // 주소값이 다름
		System.out.println(s1.equals(t1)); // 문자열의 값이 같음
		System.out.println(t1.equals(t2)); // true

	}

}
