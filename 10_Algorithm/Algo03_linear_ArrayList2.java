import java.util.Arrays;
import java.util.Collections;
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

public class Algo03_linear_ArrayList2 {

	public static void main(String[] args) {
		
		// ArrayList 참조형 데이터 정렬
		// Collections 이용
		List<Person> list = Arrays.asList(new Person("춘식이1", 100),
										  new Person("춘식이2", 80),
										  new Person("춘식이3", 60),
										  new Person("춘식이4", 90),
										  new Person("춘식이5", 70));
		// 오름차순
		Collections.sort(list, Comparator.comparing(Person::getScore));
		// 내림차순
		Collections.sort(list, Comparator.comparing(Person::getScore, Comparator.reverseOrder()));

	}

}
