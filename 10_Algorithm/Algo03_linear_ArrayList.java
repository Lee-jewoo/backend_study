import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Algo03_linear_ArrayList {

	public static void main(String[] args) {
		
		// ArrayList
		List<Integer> x = new ArrayList<Integer>();
		x.add(3); // [3]
		x.add(5); // [3, 5]
		x.add(10); // [3, 5, 10]

		List<Integer> x2 = new ArrayList<Integer>();
		x2.add(7); // [7]
		x2.add(13); // [7, 13]
		x2.add(2); // [7, 13, 2]
		
		// ArrayList에 ArrayList 저장
		x.addAll(x2); // [3, 5, 10, 7, 13, 2]
		
		// 삭제
		List<String> y = new ArrayList<String>();
		y.add("Java");
		y.add("C");
		y.add("C++");
		y.add("SQL");
		y.add("Python");
		y.add("Kotlin");
		
		y.remove(4); // Kotlin
		y.remove("SQL"); // true
		y.removeIf(s -> s.startsWith("C")); // C로 시작하는 요소 삭제
		
		// 리스트로 삭제
		List<String> y2 = new ArrayList<String>();
		y2.add("Python");
		y.removeAll(y2); // y2에 해당하는 요소 삭제
		
		// 반복 출력
		List<String> y3 = new ArrayList<String>();
		y3.add("Java");
		y3.add("C");
		y3.add("C++");
		y3.add("SQL");
		y3.add("Python");
		y3.add("Kotlin");
		
		// forEach(Consumer)
		y3.forEach(System.out::println);
		
		// Iterator
		Iterator<String> ite = y3.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		// ListIterator -> 시작 위치를 지정할 수 있음
		ListIterator<String> ite2 = y3.listIterator(6);
		while(ite2.hasPrevious()) {
			System.out.println(ite2.previous());
		}
		
		// foreach문
		for (String s : y3) {
			System.out.println(s);
		}
		
		// for문
		for (int i=0; i<y3.size(); i++) {
			System.out.println(y3.get(i));
		}
		
		// 정렬
		List<Integer> z = new ArrayList<Integer>();
		z.add(5);
		z.add(3);
		z.add(50);
		z.add(24);
		z.add(10);
		Collections.sort(z); // [3, 5, 10, 24, 50]
		Collections.sort(z, Comparator.reverseOrder()); // [50, 24, 10, 5, 3]

	}

}
