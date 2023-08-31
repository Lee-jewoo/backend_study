import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		UserService service = ctx.getBean("target", UserService.class);
		
		System.out.println(service.sayEcho());
		/*	BeforeAspect
			sayEcho
			AfterReturning 리턴값 : hello
			호출한 메서드명 : sayEcho
			AfterAspect
			hello	*/
		System.out.println(service.callEcho());
		/*	BeforeAspect
			callEcho
			AfterReturning2 리턴값 : world
			호출한 메서드명 : callEcho
			AfterAspect
			world	*/
		
	}

}
