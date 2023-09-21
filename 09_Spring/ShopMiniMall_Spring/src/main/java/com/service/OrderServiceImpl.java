package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDAO;
import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO dao;
	
	@Override
	public CartDTO cartByNum(int num) {
		return dao.cartByNum(num);
	}

	@Override
	public MemberDTO memberByOrder(String userid) {
		return dao.memberByOrder(userid);
	}

	@Transactional
	@Override
	public int orderDone(OrderDTO orderDTO, int cartNum) {
			int n = dao.orderDone(orderDTO);
			n = dao.cartDel(cartNum);
		return n;
	}

}
