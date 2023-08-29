import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		// singleton scope는 하나의 인스턴스로 여러 사용자가 공유 -> 기본 생성자가 한 번만 생성
		UserService service1 = ctx.getBean("service_singleton", UserService.class);
		UserService service2 = ctx.getBean("service_singleton", UserService.class);
		System.out.println("singleton : " + (service1==service2)); // true
		service1.username = "춘식이";
		service2.username = "라이언";
		System.out.println(service1.username + "\t" + service2.username); // 라이언	라이언
		
		// prototype scope는 인스턴스가 매번 생성 -> 기본 생성자가 여러 번 생성
		UserService service3 = ctx.getBean("service_prototype", UserService.class);
		UserService service4 = ctx.getBean("service_prototype", UserService.class);
		System.out.println("prototype : " + (service3==service4)); // false
		service3.username = "춘식이";
		service4.username = "라이언";
		System.out.println(service3.username + "\t" + service4.username); // 춘식이	라이언
		
	}

}
