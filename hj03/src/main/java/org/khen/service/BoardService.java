package org.khen.service;

import java.util.List;

import org.khen.dto.PageDTO;
import org.khen.vo.BoardVO;



public interface BoardService {
	
	public List<BoardVO> getPageList(PageDTO dto);
	public void register(BoardVO vo);
	public int getTotal();
	
}
