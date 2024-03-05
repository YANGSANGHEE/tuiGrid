package com.crud.crudtest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.crud.crudtest.boardModel.boardVO;

@Mapper
public interface boardMapper {
	
	//�˻� Ȥ�� ����Ʈ ��
	List<boardVO> selectBoardList(Map<String, Object> paramMap);
	
	//����
	int insertBoard(boardVO setBoardVO);
	
	//������Ʈ
	int updateBoard(boardVO setBoardVO);
}