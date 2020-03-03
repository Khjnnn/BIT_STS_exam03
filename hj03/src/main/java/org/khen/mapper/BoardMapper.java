package org.khen.mapper;

import java.util.List;

import org.khen.dto.PageDTO;
import org.khen.vo.BoardVO;


public interface BoardMapper {

	public List<BoardVO> getList(PageDTO dto);
	
	public int getTotal();
	
	public int insert(BoardVO vo);
}
