package exam10_2;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest3 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("춘식이");
		list1.add("라이언");
		printData(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		printData(list2);
		
	}
	
	public static void printData(List<?> x) {
		System.out.println(x);
	}

}
