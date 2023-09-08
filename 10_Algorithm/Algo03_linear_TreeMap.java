import java.util.TreeMap;

public class Algo03_linear_TreeMap {

	public static void main(String[] args) {
		
		// TreeMap -> key를 기준으로 오름차순 정렬
//		TreeMap<String, String> map = new TreeMap<String, String>();
		// 내림차순
//		TreeMap<String, String> map = new TreeMap<String, String>(Comparator.reverseOrder());
		// 대소문자를 구분하지 않고 정렬
		TreeMap<String, String> map = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		map.put("A", "AAA");
		map.put("ab", "ababab");
		map.put("B", "BBB");
		map.put("c+", "c+c+c+");
		map.put("d", "ddd");
		map.put("D", "DDD");
		map.put("AC", "ACACAC");
		map.put("C", "CCC");
		
		System.out.println(map);
		
	}

}
