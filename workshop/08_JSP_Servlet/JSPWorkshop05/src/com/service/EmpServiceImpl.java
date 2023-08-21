package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {

	@Override
	public List<EmpDTO> list() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			EmpDAO dao = new EmpDAO();
			list = dao.list(session);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int insert(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			EmpDAO dao = new EmpDAO();
			n = dao.insert(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public EmpDTO retrieve(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		EmpDTO dto = null;
		try {
			EmpDAO dao = new EmpDAO();
			dto = dao.retrieve(session, num);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public int update(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			EmpDAO dao = new EmpDAO();
			n = dao.update(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int delete(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			EmpDAO dao = new EmpDAO();
			n = dao.delete(session, num);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
