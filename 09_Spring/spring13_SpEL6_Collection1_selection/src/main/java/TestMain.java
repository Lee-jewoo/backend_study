
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		Person person1 = ctx.getBean("person1", Person.class);
		List<Cat> catList = person1.getCatList();
		
		System.out.println("1. 전체 고양이 목록");
		for (Cat cat : catList) {
			System.out.println(cat);
		}
		
		Person person2 = ctx.getBean("person2", Person.class);
		List<Cat> catList2 = person2.getCatList();
		System.out.println("2. 특정 인덱스 고양이 출력");
		for (Cat cat : catList2) {
			System.out.println(cat);
		}
		
		Person person3 = ctx.getBean("person3", Person.class);
		List<Cat> catList3 = person3.getCatList();
		System.out.println("3. 특정 조건 고양이 출력");
		// value="#{catList.?[age lt 11 and married==false]}"
		for (Cat cat : catList3) {
			System.out.println(cat);
		}
		
	}

}
