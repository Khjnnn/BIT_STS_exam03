package org.khen.service;

import java.util.List;

import org.khen.dto.PageDTO;
import org.khen.vo.BoardVO;
import org.springframework.stereotype.Service;


@Service
public interface BoardService {
	// Service 인터페이스 
	// 각 메소드 오버라이드
	public List<BoardVO> getPageList(PageDTO dto);
	public void register(BoardVO vo);
	public int getTotal();
	
}
