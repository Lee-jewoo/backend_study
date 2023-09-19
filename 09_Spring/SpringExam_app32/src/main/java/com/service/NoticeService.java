package com.service;

import com.dto.NoticeDTO;
import com.dto.PageDTO;

public interface NoticeService {
	
	// 목록 보기 + 페이징
	public PageDTO list(int curPage);
	
	// 글 작성
	public int write(NoticeDTO dto);
	
	// 상세 보기 + 조회수
	public NoticeDTO retrieve(int no);
	
	// 글 수정
	public int update(NoticeDTO dto);
	
	// 글 삭제
	public int delete(int no);

}
