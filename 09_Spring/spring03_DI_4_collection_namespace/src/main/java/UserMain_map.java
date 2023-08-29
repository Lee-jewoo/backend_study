import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService_map;

public class UserMain_map {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/config/user_map.xml");
		UserService_map service = ctx.getBean("service", UserService_map.class);
		
		Map<String, Cat> map = service.getCatMap();
		System.out.println(map);
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		
	}

}
