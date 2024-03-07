package com.crud.crudtest.boardService.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudtest.boardModel.boardVO;
import com.crud.crudtest.boardService.boardService;
import com.crud.crudtest.mapper.boardMapper;

@Service
public class boardServiceImpl implements boardService{
	
	
	private final boardMapper boardmapper;
	
	@Autowired
	public boardServiceImpl(boardMapper boardmapper) {
		this.boardmapper = boardmapper;
	}
	
	@Override
	public List<boardVO> selectBoardList(Map<String, Object> paramMap){
		List<boardVO> boardList = boardmapper.selectBoardList(paramMap);
		
		if(boardList.size() < 0) {
			return null;
		}
		
		return boardList;
	}
	
	@Override
	public int insertBoard(boardVO sBoardVO) {
		int cnt = boardmapper.insertBoard(sBoardVO);
		
		return cnt;
	}
	
	@Override
	public int updateBoard(boardVO sBoardVO) {
		int cnt = boardmapper.updateBoard(sBoardVO);
		
		return cnt;
	}
}
