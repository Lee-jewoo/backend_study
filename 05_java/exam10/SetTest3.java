package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		// generics 사용해 문자열 저장
		HashSet<String> set = new HashSet<String>();
		
		set.add("춘식이");
		set.add("라이언");
		set.add("어피치");
		set.add("조르디");
//		set.add(10); 컴파일할 때 에러 발생
		
		System.out.println(set);
		
		for (String str : set) {
			System.out.println(str.concat("님"));
		}
		
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			String str = ite.next();
			System.out.println("%%"+str);
		}
			
	}

}
