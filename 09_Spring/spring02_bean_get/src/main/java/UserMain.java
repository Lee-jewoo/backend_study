import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.UserDAO;
import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml");
		
		// xml에 등록된 bean 태그의 id값을 이용해 빈을 참조
		UserService service = (UserService)ctx.getBean("x");
		UserDAO dao = ctx.getBean("xx", UserDAO.class);
		
		System.out.println(service.hello());
		System.out.println(dao.sayHello());
		
	}

}
