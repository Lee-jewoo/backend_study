import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		// profile 결정 -> prod로 변경하면 UserService_Prod 호출
		ctx.getEnvironment().setActiveProfiles("dev");
		
		// xml 등록
		ctx.load("classpath:com/config/user_dev.xml", "classpath:com/config/user_prod.xml");
		ctx.refresh();
		
		// 빈 얻기
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service.mesg());
		
	}

}
