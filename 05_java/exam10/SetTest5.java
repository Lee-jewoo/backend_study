package exam10;

import java.util.HashSet;
import java.util.Set;

public class SetTest5 {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		set.add("춘식이");
		set.add("라이언");
		set.add("어피치");
		
		System.out.println(set);
		System.out.println(set.size()); // 크기
		System.out.println(set.contains("춘식이")); // 값 포함 여부
		System.out.println(set.isEmpty()); // 비어있는지
		set.remove("어피치"); // 값 제거
		System.out.println(set);
		set.clear(); // 비우기
		System.out.println(set);

	}

}
