import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.dto.StudentDTO;
import com.service.MyBatisServiceImpl;
import com.service.MybatisService;

public class MyBatisMain {

	public static void main(String[] args) {
		MybatisService service = new MyBatisServiceImpl();
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("\t[학생 정보 관리 메뉴]");
		System.out.println("***********************************");
		System.out.println("1.전체 학생 목록");
		System.out.println("2.학생 이름 검색");
		System.out.println("3.학생 입학년도 범위 검색 (예> 2000년부터 2003년까지)");
		System.out.println("0.종료");
		System.out.println("***********************************");
		System.out.print("메뉴 입력 => ");
			int n = sc.nextInt();
			if (n==1) {
				List<StudentDTO> list = service.selectAll();
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("--------------------------------------------------------------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size());
				
			} else if (n==2) {
				System.out.println("검색할 학생 이름을 입력하세요.");
				String stuName = sc.next();
				List<StudentDTO> list = service.selectByName(stuName);
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("--------------------------------------------------------------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size());
				
			} else if (n==3) {
				HashMap<String, String> map = new HashMap<>();
				System.out.print("시작 입학년도를 입력하세요. => ");
				map.put("startYear", sc.next());
				System.out.print("끝 입학년도를 입력하세요. => ");
				map.put("endYear", sc.next());
				List<StudentDTO> list = service.selectByEntranceDate(map);
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size());
				
			} else if (n==0) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			
		}

	}

}
