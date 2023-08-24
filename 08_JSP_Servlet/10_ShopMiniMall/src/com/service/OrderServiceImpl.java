package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OrderDAO;
import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

public class OrderServiceImpl implements OrderService {

	@Override
	public CartDTO cartByNum(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		CartDTO cartDTO = null;
		try {
			OrderDAO dao = new OrderDAO();
			cartDTO = dao.cartByNum(session, num);
		} finally {
			session.close();
		}
		return cartDTO;
	}

	@Override
	public MemberDTO memberByOrder(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO memberDTO = null;
		try {
			OrderDAO dao = new OrderDAO();
			memberDTO = dao.memberByOrder(session, userid);
		} finally {
			session.close();
		}
		return memberDTO;
	}

	@Override
	public int orderDone(OrderDTO orderDTO, int cartNum) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			OrderDAO dao = new OrderDAO();
			n = dao.orderDone(session, orderDTO);
			n = dao.cartDel(session, cartNum);
			session.commit();
		} catch (Exception e) {
			// 하나라도 실패하면 롤백
			session.rollback();
		}finally {
			session.close();
		}
		return n;
	}

}
