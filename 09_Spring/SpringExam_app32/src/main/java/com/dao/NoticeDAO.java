package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.NoticeDTO;
import com.dto.PageDTO;

@Repository
public class NoticeDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	// 목록 보기 + 페이징
	public PageDTO list(int curPage) {
		PageDTO pagedto = new PageDTO();
		
		int offset = (curPage-1)*pagedto.getPerPage();
		int limit = pagedto.getPerPage();
		List<NoticeDTO> list = session.selectList("NoticeMapper.list", null, new RowBounds(offset, limit));
		
		pagedto.setList(list);
		pagedto.setCurPage(curPage);
		pagedto.setTotalRecord(session.selectOne("NoticeMapper.totalRecord"));
		
		return pagedto;
	}
	
	// 글 작성
	public int write(NoticeDTO dto) {
		return session.insert("NoticeMapper.write", dto);
	}
	
	// 상세 보기
	public NoticeDTO retrieve(int no) {
		return session.selectOne("NoticeMapper.retrieve", no);
	}
	
	// 조회수
	public int readcnt(int no) {
		return session.update("NoticeMapper.readcnt", no);
	}
	
	// 글 수정
	public int update(NoticeDTO dto) {
		return session.update("NoticeMapper.update", dto);
	}
	
	// 글 삭제
	public int delete(int no) {
		return session.delete("NoticeMapper.delete", no);
	}
	
}
