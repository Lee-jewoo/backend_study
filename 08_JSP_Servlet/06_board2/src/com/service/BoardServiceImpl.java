package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardServiceImpl implements BoardService {

	@Override
	public PageDTO pageDTO(HashMap<String, String> map, int curPage) {
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pageDTO = null;
		try {
			BoardDAO dao = new BoardDAO();
			pageDTO = dao.list(session, map, curPage);
		} finally {
			session.close();
		}
		return pageDTO;
	}

	@Override
	public int write(BoardDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.write(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public BoardDTO retrieve(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		BoardDTO dto = null;
		try {
			BoardDAO dao = new BoardDAO();
			int n = dao.readcnt(session, num);
			session.commit();
			dto = dao.retrieve(session, num);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public int update(BoardDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			BoardDAO dao = new BoardDAO();
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
			BoardDAO dao = new BoardDAO();
			n = dao.delete(session, num);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
