import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

//		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		MessageSource ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		// 리소스 번들에서 메시지 얻기
		String mesg_ko = ctx.getMessage("greeting", null, null, Locale.KOREA);
		String mesg_en = ctx.getMessage("greeting", null, null, Locale.ENGLISH);
		System.out.println(mesg_ko+"\t"+mesg_en); // 안녕하세요		hello
	
		String mesg_arg = ctx.getMessage("greeting2", new String[] {"춘식이", "감사합니다."}, null, Locale.KOREA);
		System.out.println(mesg_arg); // 춘식이 감사합니다.
	}

}
