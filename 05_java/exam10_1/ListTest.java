package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("춘식이");
		list.add("라이언");
		list.add("어피치");
		list.add("춘식이");
		
		System.out.println("toString " + list);
		
		for (String str : list) {
			System.out.println("for each " + str);
		}
		
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println("Iterator " + ite.next());
		}
		
		System.out.println("index 0 " + list.get(0));
		System.out.println("index 1 " + list.get(1));
		System.out.println("index 2 " + list.get(2));
		System.out.println("index 3 " + list.get(3));

	}

}
