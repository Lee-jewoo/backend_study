package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("춘식이");
		set.add(10);
		set.add(3.14);
		set.add('A');
		set.add("춘식이");
		set.add("춘식이"); // 중복되는 값은 저장되지 않음
		set.add(true);
		
		System.out.println("toString " + set);
		
		for (Object obj : set) { // -> 모든 데이터를 저장할 수 있도록 Object 타입으로 지정 (다형성)
			System.out.println("for each " + obj);
		}
		
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println("iterator " + ite.next());
		}

	}

}
