package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardDAO {
	
	public PageDTO list (SqlSession session, int curPage) {
		PageDTO pageDTO = new PageDTO();
		int offset = (curPage-1)*pageDTO.getPerPage();
		int limit = pageDTO.getPerPage();
		List<BoardDTO> list = session.selectList("BoardMapper.list", null, new RowBounds(offset, limit));
		pageDTO.setList(list);
		pageDTO.setCurPage(curPage);
		int totalCount = session.selectOne("BoardMapper.totalCount");
		pageDTO.setTotalCount(totalCount);
		
		return pageDTO;
	}

}
