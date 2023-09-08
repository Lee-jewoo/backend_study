import java.util.HashMap;

public class Algo03_linear_HashMap {

	public static void main(String[] args) {
		
		// HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		
		// 반복
		// forEach(BiConsumer)
		map.forEach((key, value) -> System.out.println(key+"="+value));
		
		// keySet.forEach(Consumer)
		map.keySet().forEach(key -> System.out.println(key+"="+map.get(key)));
		
	}

}
