package deptPractice2;

import java.util.List;

public class DeptMainPractice {
	
	public static void main(String[] args) {
		DeptServicePractice service = new DeptServicePractice();
		List<DeptDTOPractice> list = service.select();
		System.out.println("부서번호\t부서명\t부서위치");
		System.out.println("------------------------------");
		for (DeptDTOPractice dto : list) {
			System.out.println(dto);
		}
		
		
	}

}
