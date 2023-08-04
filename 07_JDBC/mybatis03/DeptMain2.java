import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;

public class DeptMain2 {

	public static void main(String[] args) throws Exception {
		
		// 설정 정보 불러오기 -> import, 예외 처리
		String resource = "com/config/Configuration.xml"; // Configuration.xml의 위치
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		// session 얻기
		SqlSession session = sqlSessionFactory.openSession();

		// insert
//		DeptDTO dto = new DeptDTO(99, "개발", "서울");
//		int n = session.insert("DeptMapper2.addDept", dto);
//		System.out.println(n+"개가 저장되었습니다.");
//		session.commit();
		
		// update
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("deptno", 99);
//		map.put("dname", "연구");
//		map.put("loc", "성남");
//		int n2 = session.update("DeptMapper2.updateDept", map);
//		System.out.println(n2+"개가 수정되었습니다.");
//		session.commit();
		
		// delete
		int n3 = session.delete("DeptMapper2.deleteDept", 99);
		System.out.println(n3+"개가 삭제되었습니다.");
		session.commit();
		
		
		
		
		
		// session 닫기
		session.close();
		
	}

}
