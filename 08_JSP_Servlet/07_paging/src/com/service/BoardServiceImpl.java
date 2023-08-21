package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.PageDTO;

public class BoardServiceImpl implements BoardService {

	@Override
	public PageDTO list(int curPage) {
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pageDTO = null;
		try {
			BoardDAO dao = new BoardDAO();
			pageDTO = dao.list(session, curPage);
		} finally {
			session.close();
		}
		return pageDTO;
	}

}
