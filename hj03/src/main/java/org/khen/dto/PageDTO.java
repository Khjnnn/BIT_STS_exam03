package org.khen.dto;

import lombok.Data;

@Data
public class PageDTO {
	//페이지 정보 클래스
	
	private int page; //페이지번호
	private int amount; // 페이지당 최대갯수

	public PageDTO() {
		page = 1 ;
		amount = 10;
	}
}
