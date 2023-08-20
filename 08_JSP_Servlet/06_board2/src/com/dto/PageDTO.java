package com.dto;

import java.util.List;

public class PageDTO {
	
	List<BoardDTO> list;
	int perPage = 3; // 한 페이지의 레코드 개수
	int curPage; // 현재 페이지
	int totalRow; // 전체 레코드 개수
	
	public PageDTO() {}
	public PageDTO(List<BoardDTO> list, int perPage, int curPage, int totalRow) {
		this.list = list;
		this.perPage = perPage;
		this.curPage = curPage;
		this.totalRow = totalRow;
	}
	
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
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	@Override
	public String toString() {
		return "PageDTO [list=" + list + ", perPage=" + perPage + ", curPage=" + curPage + ", totalRow=" + totalRow
				+ "]";
	}
	
	
}
