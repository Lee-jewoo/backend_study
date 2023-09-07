package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int score;
	public Student() {}
	public Student(String name, int score) {
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
		return "Student [name=" + name + ", score=" + score + "]";
	}
}

public class StreamAPI_2_map {

	public static void main(String[] args) {
		
		// map(Function) / mapTo(Int/Double/Long)(To(Int/Double/Long)Function)
		// 요소를 가공해 새로운 스트림 반환
		List<Student> list = Arrays.asList(new Student("춘식이", 90),
										   new Student("라이언", 100),
										   new Student("죠르디", 80));
		
		// 가공 1 : 성 출력
		// 익명클래스
		Function<Student, String> mapper = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName().substring(0, 1);
			}
		};
		list.stream().map(mapper).forEach(System.out::println);
		
		// 람다 표현식
		list.stream().map(t->t.getName().substring(0, 1)).forEach(System.out::println);
		
		// 가공 2 : 점수 출력
		// 람다 표현식
		list.stream().map(t->t.getScore()).forEach(System.out::println);
		
		// 메서드 참조
		list.stream().map(Student::getScore).forEach(System.out::println);
		
		// mapToInt
		// 익명클래스
		ToIntFunction<Student> mapper3 = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getScore();
			}
		};
		list.stream().mapToInt(mapper3).forEach(System.out::println);
		
		// 람다 표현식
		list.stream().mapToInt(t->t.getScore()).forEach(System.out::println);
		
		// 메서드 참조
		list.stream().mapToInt(Student::getScore).forEach(System.out::println);
		
	}

}
