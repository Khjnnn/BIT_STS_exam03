package org.khen.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageUtil {
	// 페이지 유틸리티 클래스

	private PageDTO dto; //페이지 정보 (페이지번호,최대갯수)
	private int total, start, end; // 총합, 시작번호, 끝번호
	private boolean prev, next; // 이전 , 다음 (boolean)
	
	public PageUtil(PageDTO dto, int total) {
		this.dto = dto;
		this.total = total;
		
		int pageNum = dto.getPage(); // 페이지번호 가져옴
		int tempEnd = (int)Math.ceil(pageNum/10.0) * 10; // 가져온 페이지 번호에 대한 마지막 페이지 번호(10페이지 단위)
		this.start = tempEnd - 9 < 0 ? 1:tempEnd - 9 ; // 페이지 끝번호 - 9 > 음수면 1,아니면 -9한 값
		this.prev = this.start != 1 ; // 스타트가 1이 아닐경우 false  
		
		int realEnd = (int)(total/10.0); // 전체 페이지에 대한 끝번호 값 
		this.next = realEnd > tempEnd; // 전체 끝 이 해당페이지 끝번호보다 클경우 true (다음페이지 이동)
		if(realEnd > tempEnd) {
			this.end = tempEnd; // true > 전체 끝번호
		}else {
			this.end = realEnd + 1 ; // false > 현재 끝번호 +1
		}
	}
	
	
}
