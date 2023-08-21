package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardDAO {
	
	// 목록 보기 + 검색하기 + 페이징 처리
	public PageDTO list (SqlSession session, HashMap<String, String> map, int curPage) {
		PageDTO pageDTO = new PageDTO();
		int offset = (curPage-1)*pageDTO.getPerPage(); // 시작위치 : (현재페이지-1)*pageDTO.getPerPage();
		int limit = pageDTO.getPerPage(); // 한 페이지에 보여줄 레코드 개수
		List<BoardDTO> list = session.selectList("BoardMapper.list", map, new RowBounds(offset, limit));
		
		pageDTO.setList(list);
		pageDTO.setCurPage(curPage);
		int totalCount = 0;
		if (map.get("searchValue")==null) {
			totalCount = session.selectOne("BoardMapper.totalCount");
		} else {
			totalCount = session.selectOne("BoardMapper.totalCountSearch", map);
		}
		pageDTO.setTotalCount(totalCount);
		
		pageDTO.setSearchName(map.get("searchName"));
		pageDTO.setSearchValue(map.get("searchValue"));
		
		// PageDTO에 검색 데이터 저장
		return pageDTO;
	}
	
	// 글 작성하기
	public int write (SqlSession session, BoardDTO dto) {
		int n = session.insert("BoardMapper.write", dto);
		return n;
	}
	
	// 글 조회하기
	public BoardDTO retrieve (SqlSession session, int num) {
		BoardDTO dto = session.selectOne("BoardMapper.retrieve", num);
		return dto;
	}
	
	// 조회수
	public int readcnt (SqlSession session, int num) {
		int n = session.update("BoardMapper.readcnt", num);
		return n;
	}
	
	// 글 수정하기
	public int update (SqlSession session, BoardDTO dto) {
		int n = session.update("BoardMapper.update", dto);
		return n;
	}
	
	// 글 삭제하기
	public int delete (SqlSession session, int num) {
		int n = session.delete("BoardMapper.delete", num);
		return n;
	}

}
