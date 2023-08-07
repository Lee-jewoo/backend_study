package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	
	static SqlSessionFactory sqlSessionFactory = null; // 인스턴스이기 때문에 static에서 접근할 수 없음 -> static으로 지정
	static { // static블럭은 메서드나 생성자보다 빨리 실행됨
		// 설정 정보 불러오기 -> import, 예외 처리
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	// ServiceImpl에 SqlSession을 반환
	public static SqlSession getSession() { // 객체를 생성하지 않고 사용하기 위해 static으로 지정
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}

}
