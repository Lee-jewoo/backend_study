package exam08_1;

public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본형의 클래스
		System.out.println(Integer.MAX_VALUE); // int의 최대값
		System.out.println(Integer.MIN_VALUE); // int의 최소값
		System.out.println(Integer.parseInt("10")+1); // 문자열을 정수로 변환
		System.out.println(Integer.max(10, 20)); // 두 수 중 큰 값
		System.out.println(Integer.min(10, 20)); // 두 수 중 작은 값
		System.out.println(Integer.sum(10, 20)); // 두 수의 합
		System.out.println(Float.parseFloat("3.14")+1); // 문자열을 실수로 변환
		
		int n = 10;
		Integer X = n; // 오토박싱
		System.out.println(X);
		int m = X; // 언박싱
		System.out.println(m);
		Object [] obj = {10, 3.14, "hello"}; // 오토박싱되어 객체뿐만 아니라 기본형 데이터도 가능
		
	}

}
