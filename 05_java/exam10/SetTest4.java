package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		
		// generics를 사용해 정수 저장
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		
		for (Integer n : set) {
			System.out.println(n);
		}
		
		Iterator<Integer> ite = set.iterator();
		while (ite.hasNext()) {
			int num = ite.next();
			System.out.println("###"+num);
		}
		
	}

}
