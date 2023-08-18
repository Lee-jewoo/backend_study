package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;

public interface BoardService {
	
	// 목록보기
	public List<BoardDTO> list(HashMap<String, String> map);
	
	// 글 작성하기
	public int write (BoardDTO dto);
	
	// 글 조회하기 + 조회수
	public BoardDTO retrieve (int num);
	
	// 글 수정하기
	public int update (BoardDTO dto);
	
	// 글 삭제하기
	public int delete (int num);

}
