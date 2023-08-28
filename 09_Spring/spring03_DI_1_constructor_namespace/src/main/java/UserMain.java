import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		// IoC Container 생성
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service.getNum()+service.getName()); // 10춘식이
		
		List<String> list = service.list();
		System.out.println(list); // [춘식이, 라이언]
		
	}

}
