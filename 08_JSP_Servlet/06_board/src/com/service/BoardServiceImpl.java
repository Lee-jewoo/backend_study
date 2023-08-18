package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.BoardDTO;

public class BoardServiceImpl implements BoardService {

	@Override // 목록 보기
	public List<BoardDTO> list(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<BoardDTO> list = null;
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.list(session, map);
		} finally {
			session.close();
		}
		return list;
	}

	@Override // 글 작성하기
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

	@Override // 글 조회하기 + 조회수
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

	@Override // 글 수정하기
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

	@Override // 글 삭제하기
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
		return 0;
	}

}
