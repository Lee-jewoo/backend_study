package com.service;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

public interface OrderService {
	
	public CartDTO cartByNum (int num);
			
	public MemberDTO memberByOrder (String userid);
	
	public int orderDone (OrderDTO orderDTO, int cartNum);

}
