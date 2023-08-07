package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyBatisDAO;
import com.dto.StudentDTO;

public class MyBatisServiceImpl implements MybatisService{
	
	@Override
	public List<StudentDTO> selectAll() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<StudentDTO> list = null;
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> selectByName(String stuName) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<StudentDTO> list = null;
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.selectByName(session, stuName);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> selectByEntranceDate(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<StudentDTO> list = null;
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.selectByEntranceDate(session, map);
		} finally {
			session.close();
		}
		return list;	}
	
}
