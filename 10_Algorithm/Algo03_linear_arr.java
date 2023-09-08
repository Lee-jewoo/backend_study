import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_linear_arr {

	public static void main(String[] args) {
		
		// 배열
		// 1차원 배열
		int [] num = {10, 20, 30};
		int [] num2 = new int [] {10, 20, 30};
		
		// 2차원 배열
		int [][] num3 = {{1, 2, 3}, {4, 5}, {6}};
		int [][] num4 = new int [][] {{1, 2, 3}, {4, 5}, {6}};
		
		// Arrays 클래스
		// 리스트 생성
		List<String> list = Arrays.asList("춘식이", "라이언");
		
		// 임의의 값으로 채우기
		String [] name = {"A", "B", "C"};
		Arrays.fill(name, "x"); // [x, x, x]
		Arrays.fill(name, 0, 2, "A"); // [A, A, x]
		
		// 배열 비교
		int [] n = {1, 2, 3};
		int [] n2 = {1, 2, 3};
		Arrays.equals(n, n2); // true
		
		// 정렬
		// Comparator.reverseOrder()는 참조형 배열이어야 함
		Integer [] n3 = {21, 5, 52, 8, 49};
		Arrays.sort(n3); // [5, 8, 21, 49, 52]
		Arrays.sort(n3, Comparator.reverseOrder()); // [52, 49, 21, 8, 5]
		
		// 특정 값 위치 검색
		int [] n4 = {21, 5, 52, 8, 49};
		Arrays.binarySearch(n4, 5); // 1
		
		// 배열 크기 변경
		int [] n5 = {1, 2, 3};
		Arrays.copyOf(n5, 5); // [1, 2, 3, 0, 0]
		
		// 스트림 생성
		int [] n6 = {1, 2, 3};
		Arrays.stream(n6); // IntStream 반환

	}

}
