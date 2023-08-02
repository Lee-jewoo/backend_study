import java.util.List;
import java.util.Scanner;
import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		
		// 화면 처리 추가
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 전체 목록");
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
			} else if("0".equals(num)) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}

	}

}
