package com.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;

@Repository
public class CartDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	public int cartAdd (CartDTO dto) {
		return session.insert("CartMapper.cartAdd", dto);	
	}
	
	public List<CartDTO> cartList (String userid) {
		return session.selectList("CartMapper.cartList", userid);
	}
	
	public int cartUpdate (HashMap<String, Integer> map) {
		return session.update("CartMapper.cartUpdate", map);
	}
	
	public int cartDelete (int num) {
		return session.delete("CartMapper.cartDelete", num);
	}
	
	public int cartDeleteAll (List<String> checkList) {
		return session.delete("CartMapper.cartDeleteAll", checkList);
	}
	
}
