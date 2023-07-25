package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("이름1", "춘식이");
		map.put("이름2", "라이언");
		map.put("이름3", "어피치");
		
		System.out.println(map.size()); // 크기
		map.replace("이름3", "죠르디"); // 치환
		System.out.println(map);
		map.remove("이름3"); // 해당하는 key 삭제
		System.out.println(map);
		map.clear(); // 전체 삭제
		System.out.println(map);

	}

}
