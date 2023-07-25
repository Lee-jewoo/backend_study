package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("이름1", "춘식이");
		map.put("이름2", "라이언");
		map.put("이름3", "어피치");
		map.put("이름2", "죠르디"); // 덮어쓰기
		
		System.out.println(map); // {이름3=어피치, 이름2=라이언, 이름1=춘식이}
		System.out.println(map.get("이름1")); // 춘식이
		System.out.println(map.get("이름4")); // null
		
		Set<String> keys = map.keySet();
		System.out.println(keys); // 모든 key 반환
		for (String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		
	}

}
