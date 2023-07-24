package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		
		// generics 사용 전
		HashSet set = new HashSet();
		
		set.add("춘식이");
		set.add("라이언");
		set.add("어피치");
		set.add("조르디");
		set.add(10);
		
		for (Object obj : set) {
			String str = (String)obj;
			System.out.println(str.concat("님"));
		}
		
	}

}
