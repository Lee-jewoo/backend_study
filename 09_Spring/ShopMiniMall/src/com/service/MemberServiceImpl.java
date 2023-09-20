package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberDTO idCheck(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.idCheck(session, userid);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public int memberAdd(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			MemberDAO dao = new MemberDAO();
			n = dao.memberAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public MemberDTO login(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.login(session, map);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public MemberDTO mypage(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.mypage(session, userid);
		} finally {
			session.close();
		}
		return dto;
	}

}
