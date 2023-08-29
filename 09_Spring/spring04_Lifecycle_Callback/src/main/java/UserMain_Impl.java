import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain_Impl {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user_Impl.xml");
		
		ctx.close();
		
	}

}
