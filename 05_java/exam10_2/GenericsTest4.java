package exam10_2;

import java.util.ArrayList;
import java.util.List;

class Person {}
class Man extends Person {}
class Woman extends Person {}

public class GenericsTest4 {

	public static void main(String[] args) {

		// Man 저장
		List<Man> list1 = new ArrayList<Man>();
		list1.add(new Man());
		list1.add(new Man());
		printData1(list1);
		printData2(list1);
		
		// Woman 저장
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData1(list2);
//		printData2(list2); Man의 부모가 아니기 때문에 에러
		
		// String 저장
		List<String> list3 = new ArrayList<String>();
		list3.add("춘식이");
		list3.add("라이언");
//		printData1(list3); Person의 자식이 아니기 때문에 에러
//		printData2(list3); Man의 부모가 아니기 때문에 에러
		
		// Person만 저장
		List<Person> list4 = new ArrayList<Person>();
		list4.add(new Person());
		list4.add(new Person());
		printData1(list4);
		printData2(list4);
		
	}
	
	public static void printData1(List<? extends Person> x) {
		System.out.println(x);
	}
	public static void printData2(List<? super Man> y) {
		System.out.println(y);
	}

}
