import java.util.HashMap;
import java.util.List;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		
		// service와 연동
		DeptService service = new DeptServiceImpl();
		
		// findAll
		System.out.println("findAll");
		List<DeptDTO> list = service.findAll();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println();
		
		// findByDeptno		
		System.out.println("findByDeptno");
		DeptDTO dto = service.findByDeptno(10);
		System.out.println(dto);
		System.out.println();
		
		// insert
//		System.out.println("insert");
//		int n = service.addDept(new DeptDTO(99, "연구", "강동"));
//		System.out.println(n+"개가 저장되었습니다.");
//		System.out.println();
		
		// update
//		System.out.println("update");
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("deptno", 91);
//		map.put("dname", "개발");
//		map.put("loc", "서울");
//		int n2 = service.updateDept(map);
//		System.out.println(n2+"개가 수정되었습니다.");
//		System.out.println();

		// delete
//		System.out.println("delete");
//		int n3 = service.deleteDept(99);
//		System.out.println(n3+"개가 삭제되었습니다.");
//		System.out.println();
	}

}
