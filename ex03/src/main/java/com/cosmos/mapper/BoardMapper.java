package com.cosmos.mapper;

import java.util.List;

import com.cosmos.domain.BoardVO;
import com.cosmos.domain.Criteria;

public interface BoardMapper {

	public List<BoardVO> getList();

	//@Select("select * from tbl_board")
	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);
}
