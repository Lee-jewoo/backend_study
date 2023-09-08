import java.util.LinkedHashMap;

public class Algo03_linear_LingkedHashMap {

	public static void main(String[] args) {

		// LinkedHashMap 생성 ( 기본적으로 저장순서 유지됨 )
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");

		// 반복
		// forEach(BiConsumer)
		map.forEach((key, value) -> System.out.println(key + "=" + value));
		System.out.println();

		// keySet.forEach(Consumer)
		map.keySet().forEach(key -> System.out.println(key + "=" + map.get(key)));

	}

}
