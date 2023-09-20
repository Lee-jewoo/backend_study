package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;

public class CartServiceImpl implements CartService {

	@Override
	public int cartAdd(CartDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public List<CartDTO> cartList(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<CartDTO> list = null;
		try {
			CartDAO dao = new CartDAO();
			list = dao.cartList(session, userid);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int cartUpdate(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartUpdate(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int cartDelete(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartDelete(session, num);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int cartDeleteAll(List<String> checkList) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartDeleteAll(session, checkList);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
