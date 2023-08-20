package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardDAO {
	
	public PageDTO list (SqlSession session, HashMap<String, String> map, int curPage) {
		PageDTO pageDTO = new PageDTO();
		int offset = (curPage-1)*pageDTO.getPerPage();
		int limit = pageDTO.getPerPage();
		List<BoardDTO> list = session.selectList("BoardMapper.list", map, new RowBounds(offset, limit));
		
		pageDTO.setList(list);
		pageDTO.setCurPage(curPage);
		int totalRow = 0;
		if (map.get("searchValue") == null) {
			totalRow = session.selectOne("BoardMapper.totalRow");
		} else {
			totalRow = session.selectOne("BoardMapper.totalRowSearch");
		}
		pageDTO.setTotalRow(totalRow);
		return pageDTO;
	}
	
	public int write (SqlSession session, BoardDTO dto) {
		int n = session.insert("BoardMapper.write", dto);
		return n;
	}
	
	public BoardDTO retrieve (SqlSession session, int num) {
		BoardDTO dto = session.selectOne("BoardMapper.retrieve", num);
		return dto;
	}
	
	public int readcnt (SqlSession session, int num) {
		int n = session.update("BoardMapper.readcnt", num);
		return n;
	}
	
	public int update (SqlSession session, BoardDTO dto) {
		int n = session.update("BoardMapper.update", dto);
		return n;
	}
	
	public int delete (SqlSession session, int num) {
		int n = session.delete("BoardMapper.delete", num);
		return n;
	}

}
