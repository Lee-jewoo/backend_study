package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {
	
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		String resource = "com/config/Configuration.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
	}	
	
	@Override // select
	public List<DeptDTO> findAll () {
		// SqlSession 얻기
		SqlSession session = sqlSessionFactory.openSession();
		// DAO와 연동
		List<DeptDTO> list = null;
		try {
			DeptDAO dao = new DeptDAO();
			list = dao.findAll(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public DeptDTO findByDeptno (int deptno) {
		SqlSession session = sqlSessionFactory.openSession();
		DeptDTO dto = null;
		try {
			DeptDAO dao = new DeptDAO();
			dto = dao.findByDeptno(session, deptno);
		} finally {
			session.close();
		}

		return dto;
	}

	@Override
	public int addDept(DeptDTO dto) {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.addDept(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int updateDept(HashMap<String, Object> map) {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.updateDept(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int deleteDept(int deptno) {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.deleteDept(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}
	
}

