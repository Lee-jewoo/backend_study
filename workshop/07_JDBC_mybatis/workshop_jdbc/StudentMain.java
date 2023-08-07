package workshop_jdbc;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("****************************************");
			System.out.println("\t[학생 정보 관리 메뉴]");
			System.out.println("****************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 특정 학생 목록");
			System.out.println("3. 학생 입학년도 범위 검색 (예> 2000년부터 2003년까지)");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄 수정");
			System.out.println("6. 학과 정원 일괄 수정");
			System.out.println("7. 학생 학점 검색");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력 => ");
			String n = scan.nextLine();
			if ("1".equals(n)) {
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.selectAll();
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size()+"명");
			} else if("2".equals(n)) {
				System.out.print("검색할 학생 이름을 입력하세요. => ");
				String scName = scan.next();
				// service와 연동
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.searchName(scName);
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size()+"명");

			} else if("3".equals(n)) {
				System.out.print("시작 입학년도를 입력하세요. => ");
				int startYear = scan.nextInt();
				System.out.print("끝 입학년도를 입력하세요. => ");
				int endYear = scan.nextInt();
				// service와 연동
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.stuEnt(startYear, endYear);
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size()+"명");

			} else if("4".equals(n)) {
				System.out.print("검색할 학생의 학번을 입력하세요. => ");
				String inputStuNo = scan.nextLine();
				// service와 연동
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.searchStuNo(inputStuNo);
				for (StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생 수 : "+list.size()+"명");

			} else if("5".equals(n)) {
				System.out.print("수정할 학생의 학번을 입력하세요. => ");
				String updateStuNo = scan.nextLine();
				int num = 0;
				// service와 연동
				StudentService service = new StudentServiceImpl();
				num = service.updateAbs(updateStuNo);
				System.out.println(num+"명이 수정되었습니다.");
				
			} else if("6".equals(n)) {
				int num = 0;
				StudentService service = new StudentServiceImpl();
				num = service.inccapacity();
				System.out.println(num+"개 학과가 수정되었습니다.");
			} else if("7".equals(n)) {
				System.out.print("학생의 학번을 입력하세요.");
				String inputStuNo = scan.next();
				StudentService service = new StudentServiceImpl();
				List<List<String>> list = service.grade(inputStuNo);
				System.out.println("=============================================");
				System.out.println("학기\t학번\t이름\t과목명\t\t점수\t학점");
				System.out.println("=============================================");
				for (int i=0; i<list.size(); i++) {
					for (int j=0; j<list.get(i).size(); j++) {
						System.out.print(list.get(i).get(j)+"\t");
					}
					System.out.println();
				}
			}  else if ("0".equals(n)) {
				System.out.println("종료");
				System.exit(0);
			}
			
		}

	}

}
