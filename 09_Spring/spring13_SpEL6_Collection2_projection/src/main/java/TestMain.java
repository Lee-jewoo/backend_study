
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
		List<String> catNameList = person2.getCatNameList();
		System.out.println("2. 전체 고양이 이름");
		for (String name : catNameList) {
			System.out.println(name);
		}
		
		Person person3 = ctx.getBean("person3", Person.class);
		List<String> catNameList2 = person3.getCatNameList();
		System.out.println("3. 조건에 맞는 고양이 이름");
		for (String name : catNameList2) {
			System.out.println(name);
		}
		
	}

}
