
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		Person person2 = ctx.getBean("person2", Person.class);
		System.out.println(person2);
		
	}

}
