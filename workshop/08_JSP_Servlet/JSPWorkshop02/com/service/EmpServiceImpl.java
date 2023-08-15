package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.SessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {
	
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

}
