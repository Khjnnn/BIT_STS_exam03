package org.khen.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	// 데이터 get/set
	private int bno;
	private String title, content, writer;
	private Date regdate, updateDate;
	
}
