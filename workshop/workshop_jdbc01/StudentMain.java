package workshop_jdbc01;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		List<StudentDTO> list = service.findAll();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("\t[학생 정보 관리 메뉴]");
		System.out.println("****************************************");
		System.out.println("1. 전체 학생 목록");
		System.out.println("0. 종료");
		System.out.print("메뉴 입력 => ");
		String n = scan.nextLine();
		int cnt = 0;
		if ("1".equals(n)) {
			System.out.println("========================================");
			System.out.println("학번\t\t학과번호\t이름\t주민번호\t\t\t"
					+ "주소\t\t입학년도\t\t휴학여부\t\t\t지도교수번호");
			System.out.println("----------------------------------------");
			for (StudentDTO dto : list) {
				System.out.println(dto);
				cnt++;
			}
			System.out.println("총 학생 수 : "+cnt+"명");
		} else if ("0".equals(n)) {
			System.out.println("종료");
			System.exit(0);
		}
		
	}

}
