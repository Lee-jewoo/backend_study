import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/spring_config.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
//		// insert
//		DeptDTO dto1 = new DeptDTO(92, "관리", "하남");
//		int n1 = service.deptAdd(dto1);
		
//		// update
//		DeptDTO dto2 = new DeptDTO(80, "인사", "서울");
//		int n2 = service.deptUpdate(dto2);
//		
//		// delete
//		int n3 = service.deptDelete(92);
		
		List<DeptDTO> list = service.deptList();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
