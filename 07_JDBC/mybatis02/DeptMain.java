import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
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

		// method 호출
		// 단일행 호출
		// findByDeptno
		DeptDTO dto = session.selectOne("DeptMapper.findByDeptno", 10);
		System.out.println("findByDeptno---------------------");
		System.out.println(dto);
		
		// 복수행 호출
		// findAll
		List<DeptDTO> list = session.selectList("DeptMapper.findAll");
		System.out.println("findAll--------------------------");
		for (DeptDTO d : list) {
			System.out.println(d);
		}
		
		// findByDeptnoAndDname
		DeptDTO dto2 = new DeptDTO();
		dto2.setDeptno(10);
		dto2.setDname("개");
		List<DeptDTO> list2 = session.selectList("DeptMapper.findByDeptnoAndDname", dto2);
		System.out.println("findByDeptnoAndDname-------------");
		for (DeptDTO t : list2) {
			System.out.println(t);
		}
		
		// findByDeptnoAndDnameMap
		HashMap<String, Object> map = new HashMap<>();
		map.put("xx", 10);
		map.put("yy", "개발");
		List<DeptDTO> list3 = session.selectList("DeptMapper.findByDeptnoAndDnameMap", map);
		System.out.println("findByDeptnoAndDnameMap----------");
		for (DeptDTO dto3 : list3) {
			System.out.println(dto3);
		}
		
		// findAllPage
		RowBounds bounds = new RowBounds (0, 3); // 1번 행부터 3개
		List<DeptDTO> list4 = session.selectList("DeptMapper.findAllPage", null, bounds);
		System.out.println("findAllPage----------------------");
		for (DeptDTO dto4 : list4) {
			System.out.println(dto4);
		}
		
		
		// session 닫기
		session.close();
		
	}

}
