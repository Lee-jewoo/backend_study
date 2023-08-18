package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;

public class BoardDAO {
	
	// 목록 보기 + 검색하기
	public List<BoardDTO> list (SqlSession session, HashMap<String, String> map) {
		List<BoardDTO> list = session.selectList("BoardMapper.list", map);
		return list;
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
