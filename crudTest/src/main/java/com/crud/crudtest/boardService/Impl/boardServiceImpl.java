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
	public Map<String,Object> selectBoardDetail(Map<String, Object> paramMap) {
		Map<String, Object> boardDetail = boardmapper.selectBoardDetail(paramMap);

		return boardDetail;
	}
	
	@Override
	public int insertBoard(Map<String,Object> paramMap) {
		int cnt = boardmapper.insertBoard(paramMap);
		
		return cnt;
	}
	
	@Override
	public int updateBoard(Map<String,Object> paramMap) {
		int cnt = boardmapper.updateBoard(paramMap);
		
		return cnt;
	}
}
