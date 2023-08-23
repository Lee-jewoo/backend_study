package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;

public class GoodsServiceImpl implements GoodsService {

	@Override
	public List<GoodsDTO> goodsList(String gCategory) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<GoodsDTO> list = null;
		try {
			GoodsDAO dao = new GoodsDAO();
			list = dao.goodsList(session, gCategory);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) {
		SqlSession session = MySqlSessionFactory.getSession();
		GoodsDTO dto = null;
		try {
			GoodsDAO dao = new GoodsDAO();
			dto = dao.goodsRetrieve(session, gCode);
		} finally {
			session.close();
		}
		return dto;
	}

	
	
}
