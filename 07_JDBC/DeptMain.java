import java.util.List;
import java.util.Scanner;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		
		// 화면 처리 추가
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 전체 목록");
			System.out.println("2. 데이터 저장");
			System.out.println("3. 데이터 수정");
			System.out.println("0. 종료");
			System.out.println("----------------");
			String num = scan.nextLine();
			if("1".equals(num)) {
				// DeptService 연동
				DeptService service = new DeptServiceImpl();
				List<DeptDTO> list = service.findAll();
				System.out.println("부서번호\t부서명\t부서위치");
				System.out.println("-----------------------------");
				for (DeptDTO dto : list) {
					System.out.println(dto);
				}
			} else if("2".equals(num)) {
				System.out.println("부서번호를 입력하세요.");
				String deptno = scan.next();
				System.out.println("부서명을 입력하세요.");
				String dname = scan.next();
				System.out.println("부서위치를 입력하세요.");
				String loc = scan.next();
				// 입력받은 값을 DTO에 저장 -> service -> DAO
				DeptDTO dto = new DeptDTO(Integer.parseInt(deptno), dname, loc);
				// service와 연동
				DeptService service = new DeptServiceImpl();
				int n=0;
				try {
					n = service.insert(dto);
				} catch (DuplicatedDeptnoException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(n+"개가 저장되었습니다.");
			} else if("3".equals(num)) {
				System.out.println("수정할 부서번호를 입력하세요.");
				String deptno = scan.next();
				System.out.println("수정할 부서명을 입력하세요.");
				String dname = scan.next();
				System.out.println("수정할 부서위치를 입력하세요.");
				String loc = scan.next();
				// 입력받은 값을 DTO에 저장 -> service -> DAO
				DeptDTO dto = new DeptDTO(Integer.parseInt(deptno), dname, loc);
				// service와 연동
				DeptService service = new DeptServiceImpl();
				int n = service.update(dto);
				System.out.println(n+"개가 수정되었습니다.");
			} else if("0".equals(num)) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}

	}

}
