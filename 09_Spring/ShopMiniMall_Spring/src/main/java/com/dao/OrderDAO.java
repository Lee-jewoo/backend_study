package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

@Repository
public class OrderDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	public CartDTO cartByNum (int num) {
		return session.selectOne("OrderMapper.cartByNum", num);
	}

	public MemberDTO memberByOrder (String userid) {
		return session.selectOne("OrderMapper.memberByOrder", userid);
	}
	
	public int orderDone (OrderDTO orderDTO) {
		return session.insert("OrderMapper.orderDone", orderDTO);
	}
	
	public int cartDel (int cartNum) {
		return session.delete("OrderMapper.cartDel", cartNum);
	}
	
}
