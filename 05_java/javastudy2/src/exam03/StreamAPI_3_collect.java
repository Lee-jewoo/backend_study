package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Stu {
	String name;
	int grade;
	boolean isMail;
	int age;
	public Stu() {}
	public Stu(String name, int grade, boolean isMail, int age) {
		this.name = name;
		this.grade = grade;
		this.isMail = isMail;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public boolean isMail() {
		return isMail;
	}
	public void setMail(boolean isMail) {
		this.isMail = isMail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", grade=" + grade + ", isMail=" + isMail + ", age=" + age + "]";
	}
}

public class StreamAPI_3_collect {

	public static void main(String[] args) {
		
		// 최종 처리 : collect(Collector<T, A, R> collector)
		// Collectors 클래스 사용 (Collector 인터페이스 대신)
		// Collectors.메서드 사용 (static 메서드이기 때문)
		
		Stu [] stuarr = {new Stu("춘식이", 1, true, 5),
						 new Stu("라이언", 2, true, 10),
						 new Stu("죠르디", 3, false, 3),
						 new Stu("어피치", 2, false, 12),
						 new Stu("무지", 3, true, 11)};
		// 이름만 출력
		Arrays.stream(stuarr).map(Stu::getName).forEach(System.out::println);
		
		// 이름만 List에 저장
		List<String> list = Stream.of(stuarr).map(Stu::getName).collect(Collectors.toList());
		System.out.println(list);
		
		// Stu를 Map에 저장
		Map<String, Stu> map = Stream.of(stuarr).collect(Collectors.toMap(s -> s.getName(), u -> u));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		
		// 개수
		System.out.println(Stream.of(stuarr).collect(Collectors.counting()));
		
		// 합계
		int sum = Stream.of(stuarr).collect(Collectors.summingInt(Stu::getAge));
		System.out.println("나이 합계 : "+sum);
		
		// 최대
		Optional<Stu> max = Stream.of(stuarr).collect(Collectors.maxBy(Comparator.comparing(Stu::getAge)));
		System.out.println("나이 최대 : "+max.get());
		System.out.println("나이 최대 : "+max.orElse(null));
		
		// 최대
		Stu min = Stream.of(stuarr).collect(Collectors.minBy(Comparator.comparing(Stu::getAge))).orElse(null);
		System.out.println("나이 최소 : "+min);
		
		// collect(Collectors.partitioningBy(Predicate)) : true/false를 구분해 map으로 반환
		// 성별 분류
		Predicate<Stu> predicate = new Predicate<Stu>() {
			@Override
			public boolean test(Stu t) {
				return t.isMail();
			}
		};
		Map<Boolean, List<Stu>> m = Stream.of(stuarr).collect(Collectors.partitioningBy(predicate));
		Map<Boolean, List<Stu>> m2 = Stream.of(stuarr).collect(Collectors.partitioningBy(t -> t.isMail()));
		Map<Boolean, List<Stu>> m3 = Stream.of(stuarr).collect(Collectors.partitioningBy(Stu::isMail));
		List<Stu> male = m.get(true);
		List<Stu> female = m2.get(false);
		System.out.println("남자 : "+male);
		System.out.println("여자 : "+female);
		
		// collect(Collectors.groupingBy(Function)) : Function의 리턴값으로 그룹핑해 map으로 반환
		// grade 분류
		Function<Stu, Integer> classifier = new Function<Stu, Integer>() {
			@Override
			public Integer apply(Stu t) {
				return t.getGrade();
			}
		};
		Map<Integer, List<Stu>> n = Stream.of(stuarr).collect(Collectors.groupingBy(classifier));
		Set<Integer> keyss = n.keySet();
		for (Integer key : keyss) {
			System.out.println(key+"\t"+n.get(key));
		}
		
		// grade별 개수
		Map<Integer, Long> c = Stream.of(stuarr).collect(Collectors.groupingBy(classifier, Collectors.counting()));
		System.out.println("grade별 개수 : "+c);
		
	}

}
