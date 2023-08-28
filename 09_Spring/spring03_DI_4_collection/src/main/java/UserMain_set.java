import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService_set;

public class UserMain_set {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user_set.xml");
		UserService_set service = ctx.getBean("service", UserService_set.class);
		
		Set<Cat> set = service.getCatSet();
		System.out.println(set);
		
	}

}
