import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;

public class DeptMain {

	public static void main(String[] args) throws Exception {
		
		// 설정 정보 불러오기 -> import, 예외 처리
		String resource = "com/config/Configuration.xml"; // Configuration.xml의 위치
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		// session 얻기
		SqlSession session = sqlSessionFactory.openSession();

		// Dynamic SQL
		// multi select
		List<Integer> deptnoList = Arrays.asList(10, 20, 30, 40);
		List<DeptDTO> list = session.selectList("DeptDynamicMapper.selectByDeptnoMulti", deptnoList);
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println();
		
		// multi select2
		List<DeptDTO> deptnoList2 = Arrays.asList(new DeptDTO(10, "", ""),
												  new DeptDTO(20, "", ""),
												  new DeptDTO(40, "", ""));
		List<DeptDTO> list2 = session.selectList("DeptDynamicMapper.selectByDeptnoMulti2", deptnoList2);
		for (DeptDTO dto : list2) {
			System.out.println(dto);
		}
		System.out.println();
		
		// multi delete
//		List<Integer> deptnoList3 = Arrays.asList(11, 12);
//		int n = session.delete("DeptDynamicMapper.deleteMulti", deptnoList3);
//		System.out.println(n+"개가 삭제되었습니다.");
//		session.commit();
		
		// multi update
//		List<Integer> deptnoList4 = Arrays.asList(60, 80);
//		int n2 = session.update("DeptDynamicMapper.updateMulti", deptnoList4);
//		System.out.println(n2+"개가 수정되었습니다.");
//		session.commit();
		
		// multi insert
//		List<DeptDTO> deptnoList5 = Arrays.asList(new DeptDTO(70, "개발", "서울"),
//												  new DeptDTO(90, "연구", "성남"),
//												  new DeptDTO(91, "인사", "하남"));
//		int n3 = session.insert("DeptDynamicMapper.insertMulti", deptnoList5);
//		System.out.println(n3+"개가 저장되었습니다.");
//		session.commit();
		
		// 조건
		// 단일 if문
		String dname = "개발"; // 개발만 출력
//		String dname = null; // 모두 출력
		List<DeptDTO> list3 = session.selectList("DeptDynamicMapper.selectAllorDname", dname);
		for (DeptDTO dto : list3) {
			System.out.println(dto);
		}
		System.out.println();
		
		// 다중 조건 (choose문)
		HashMap<String, String> map = new HashMap<>();
		map.put("dname", "개발");
		List<DeptDTO> list4 = session.selectList("DeptDynamicMapper.selectByDnameChoose", map);
		for (DeptDTO dto : list4) {
			System.out.println(dto);
		}
		System.out.println();
		
		// session 닫기
		session.close();
		
	}

}
