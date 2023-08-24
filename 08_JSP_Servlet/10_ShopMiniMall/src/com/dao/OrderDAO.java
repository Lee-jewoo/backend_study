package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

public class OrderDAO {
	
	public CartDTO cartByNum (SqlSession session, int num) {
		return session.selectOne("OrderMapper.cartByNum", num);
	}

	public MemberDTO memberByOrder (SqlSession session, String userid) {
		return session.selectOne("OrderMapper.memberByOrder", userid);
	}
	
	public int orderDone (SqlSession session, OrderDTO orderDTO) {
		return session.insert("OrderMapper.orderDone", orderDTO);
	}
	
	public int cartDel (SqlSession session, int cartNum) {
		return session.delete("OrderMapper.cartDel", cartNum);
	}
	
}
