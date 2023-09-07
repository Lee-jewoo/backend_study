package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	int score;
	public Person() {}
	public Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + "]";
	}
}

public class StreamAPI_2_sorted_skip_limit {

	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(new Person("춘식이1", 100),
										  new Person("춘식이2", 80),
										  new Person("춘식이3", 60),
										  new Person("춘식이4", 90),
										  new Person("춘식이5", 70));
		
		// sorted : 정렬
		System.out.println("오름차순 asc");
		list.stream().sorted(Comparator.comparing(Person::getScore)).forEach(System.out::println);
		System.out.println("내림차순 desc");
		list.stream().sorted(Comparator.comparing(Person::getScore, Comparator.reverseOrder())).forEach(System.out::println);
		
		// skip : n개를 건너 뛰고 가져오기
		System.out.println("오름차순 정렬 후 2개 skip");
		list.stream().sorted(Comparator.comparing(Person::getScore)).skip(2).forEach(System.out::println);
		
		// limit : n개만 가져오기
		System.out.println("오름차순 정렬 후 2개 limit");
		list.stream().sorted(Comparator.comparing(Person::getScore)).limit(2).forEach(System.out::println);
		
	}

}
