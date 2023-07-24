package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> list2 = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("춘식이");
		list.add("라이언");
		list.add("어피치");
		list.add("춘식이");
		
		System.out.println(list.size()); // 크기
		list.set(3, "죠르디"); // 수정
		System.out.println(list);
		list.add(2, "무지"); // 삽입
		System.out.println(list);
		list.remove(2); // 삭제 (index)
		System.out.println(list);
		list.remove("죠르디"); // 삭제 (일치하는 첫 번째 값)
		System.out.println(list);
		
		List<String> subList = list.subList(0, 2); // 부분 리스트
		System.out.println(subList);
		
		list.removeAll(Arrays.asList("춘식이")); // 모두 삭제
		System.out.println(list);

	}

}
