package com.dto;

import java.util.List;

public class PageDTO {
	
	List<NoticeDTO> list;
	int perPage = 3;
	int curPage;
	int totalRecord;
	
	public PageDTO() {}
	public PageDTO(List<NoticeDTO> list, int perPage, int curPage, int totalRecord) {
		this.list = list;
		this.perPage = perPage;
		this.curPage = curPage;
		this.totalRecord = totalRecord;
	}
	
	public List<NoticeDTO> getList() {
		return list;
	}
	public void setList(List<NoticeDTO> list) {
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
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
	@Override
	public String toString() {
		return "PageDTO [list=" + list + ", perPage=" + perPage + ", curPage=" + curPage + ", totalRecord="
				+ totalRecord + "]";
	}
	
}
