import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain_Anno {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user_anno.xml");
		
		ctx.close();
		
	}

}
