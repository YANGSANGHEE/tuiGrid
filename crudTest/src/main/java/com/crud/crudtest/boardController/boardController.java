package com.crud.crudtest.boardController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.crudtest.boardModel.boardVO;
import com.crud.crudtest.boardService.boardService;

@Controller
@RequestMapping("/board")
public class boardController {
	
	@Autowired
	boardService boardservice;
	
	@RequestMapping(value="/viewBoardList",method = {RequestMethod.GET})
	public String viewBoardView(ModelMap model) {
		return "boardList";
	}
	
	@RequestMapping(value="/selectBoardList",method = {RequestMethod.GET})
	@ResponseBody
	public List<boardVO> selectBoardList(Map<String, Object> paramMap) {
	    if (paramMap.get("keyword") == null) {
	        paramMap.put("keyword", null);
	    }
		
	    HashMap<String, Object> resultMap = new HashMap<String, Object>();
		List<boardVO> result = boardservice.selectBoardList(paramMap);
		
		resultMap.put("data",result);
		
		
		return result;
	}
	
}