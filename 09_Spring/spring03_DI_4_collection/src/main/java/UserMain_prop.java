import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService_prop;

public class UserMain_prop {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user_prop.xml");
		UserService_prop service = ctx.getBean("service", UserService_prop.class);
		
		Properties phones = service.getPhones();
		System.out.println(phones);
		Set<String> keys = phones.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"\t"+phones.getProperty(key));
		}
		
	}

}
