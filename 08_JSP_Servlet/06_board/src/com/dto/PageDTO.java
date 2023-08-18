package com.dto;

import java.util.List;

public class PageDTO {
	
	List<BoardDTO> list; // 3가지 정보를 담은 리스트
	int perPage = 3; // 한 페이지에 출력할 레코드 개수
	int totalCount; // 전체 레코드 개수
	int curPage; // 현재 페이지 번호
	public List<BoardDTO> getList() {
		return list;
	}
	public void setList(List<BoardDTO> list) {
		this.list = list;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

}
