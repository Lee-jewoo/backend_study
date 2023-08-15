package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.SessionFactory;
import com.dao.StudentDAO;
import com.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	
	public List<StudentDTO> select() {
		SqlSession session = SessionFactory.getSession();
		List<StudentDTO> list = null;
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.select(session);
		} finally {
			session.close();
		}
		return list;
	}

}
