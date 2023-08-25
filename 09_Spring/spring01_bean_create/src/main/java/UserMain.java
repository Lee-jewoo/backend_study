import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		// 이전 방식
//		UserService service = new UserService();
//		System.out.println(service.mesg());
		
		// Spring 방식
		// 빈 생성 : src/main/resources/user.xml -> 다양한 설정 정보를 저장할 수 있음
		// 빈을 xml에 등록 : <bean id="xxx" class="com.service.UserService"></bean>
		// ApplicationContext에 빈 정보를 전달
		ApplicationContext ctx = new GenericXmlApplicationContext("user.xml");
		
	}

}
