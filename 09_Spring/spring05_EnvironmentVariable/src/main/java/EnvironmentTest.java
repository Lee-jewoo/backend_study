import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentTest {

	public static void main(String[] args) {
		
		// 자바 클래스
		Properties props = System.getProperties();
		Set<String> keys = props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"\t"+props.getProperty(key));
		}
		
		// 스프링
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		Map<String, Object> map = env.getSystemProperties();
		Set<String> keys2 = map.keySet();
		for (String key : keys2) {
			System.out.println(key+"\t"+map.get(key));
		}

	}

}
