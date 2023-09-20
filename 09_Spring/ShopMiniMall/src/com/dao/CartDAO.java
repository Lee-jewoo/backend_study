package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;

public class CartDAO {
	
	public int cartAdd (SqlSession session, CartDTO dto) {
		int n = session.insert("CartMapper.cartAdd", dto);
		return n;	
	}
	
	public List<CartDTO> cartList (SqlSession session, String userid) {
		return session.selectList("CartMapper.cartList", userid);
	}
	
	public int cartUpdate (SqlSession session, HashMap<String, Integer> map) {
		return session.update("CartMapper.cartUpdate", map);
	}
	
	public int cartDelete (SqlSession session, int num) {
		return session.delete("CartMapper.cartDelete", num);
	}
	
	public int cartDeleteAll (SqlSession session, List<String> checkList) {
		return session.delete("CartMapper.cartDeleteAll", checkList);
	}
	
}
