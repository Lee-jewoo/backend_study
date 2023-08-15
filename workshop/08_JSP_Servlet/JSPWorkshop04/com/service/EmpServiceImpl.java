package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.SessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {
	
	@Override
	public List<EmpDTO> select() {
		SqlSession session = SessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			EmpDAO dao = new EmpDAO();
			list = dao.select(session);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int insert(EmpDTO dto) {
		SqlSession session = SessionFactory.getSession();
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

}
