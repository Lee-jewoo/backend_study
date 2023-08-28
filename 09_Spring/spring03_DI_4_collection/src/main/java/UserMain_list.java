import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService_list;

public class UserMain_list {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user_list.xml");
		UserService_list service = ctx.getBean("service", UserService_list.class);
		
		List<Cat> list = service.getCatList();
		System.out.println(list);
		
	}

}
