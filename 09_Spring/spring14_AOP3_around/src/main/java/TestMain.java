import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		UserService service = ctx.getBean("target", UserService.class);
		try {
			System.out.println(service.sayEcho());			
		} catch (Exception e) {
			
		}
		/*	예외 발생 X
		  	Around Aspect
			Before 역할
			sayEcho
			After 역할
			AfterReturning 역할 : hello
			hello	*/
		/*	예외 발생 O
		  	Around Aspect
			Before 역할
			sayEcho	*/
			
		System.out.println(service.callEcho());
		/*	callEcho
			world	*/
		
	}

}
