package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NoticeDAO;
import com.dto.NoticeDTO;
import com.dto.PageDTO;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDAO dao;
	
	// 목록 보기 + 페이징
	@Override
	public PageDTO list(int curPage) {
		return dao.list(curPage);
	}

	// 글 작성
	@Override
	public int write(NoticeDTO dto) {
		return dao.write(dto);
	}

	// 상세 보기 + 조회수
	@Transactional
	@Override
	public NoticeDTO retrieve(int no) {
		dao.readcnt(no);
		return dao.retrieve(no);
	}

	// 글 수정
	@Override
	public int update(NoticeDTO dto) {
		return dao.update(dto);
	}

	// 글 삭제
	@Override
	public int delete(int no) {
		return dao.delete(no);
	}

}
