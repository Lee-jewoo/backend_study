package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {
	
	@Override // select
	public List<DeptDTO> findAll () {
		SqlSession session = MySqlSessionFactory.getSession();
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
		SqlSession session = MySqlSessionFactory.getSession();
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
		SqlSession session = MySqlSessionFactory.getSession();
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
		SqlSession session = MySqlSessionFactory.getSession();
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
		SqlSession session = MySqlSessionFactory.getSession();
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
