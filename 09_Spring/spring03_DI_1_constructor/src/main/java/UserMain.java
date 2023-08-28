import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		// IoC Container 생성
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService xxx = ctx.getBean("xxx", UserService.class);
		System.out.println(xxx.getNum()); // 0
		
		UserService yyy = ctx.getBean("yyy", UserService.class);
		System.out.println(yyy.getNum()); // 10
		
		UserService zzz = ctx.getBean("zzz", UserService.class);
		System.out.println(zzz.getNum() + zzz.getName()); // 10춘식이
		
		UserService service = ctx.getBean("service", UserService.class);
		List<String> list = service.list();
		System.out.println(list); // [춘식이, 라이언]
		System.out.println(list +"\t"+ service.getNum()); // [춘식이, 라이언]	10
		
	}

}
