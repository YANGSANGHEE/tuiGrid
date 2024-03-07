package com.crud.crudtest.boardController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.crudtest.boardModel.boardVO;
import com.crud.crudtest.boardService.boardService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/board")
public class boardController {
	
	@Autowired
	boardService boardservice;
	
	//리스트화면
	@RequestMapping(value="/viewBoardList",method = {RequestMethod.GET})
	public String viewBoardView(ModelMap model) {
		return "boardList";
	}
	
	//리스트 데이터(그리드 적용용 json)
	@RequestMapping(value="/selectBoardList",method = {RequestMethod.GET})
	@ResponseBody
	public List<boardVO> selectBoardList(@RequestParam Map<String,Object> paramMap) {
		List<boardVO> result = boardservice.selectBoardList(paramMap);
		
		return result;
	}
	
	//board상세페이지
	@RequestMapping(value="/viewboardDetail",method = {RequestMethod.GET})
	public String viewBoardDetailPage(HttpServletRequest req, ModelMap model) {
		String seq = req.getParameter("seq");
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("seq", seq);
		Map<String, Object> result = boardservice.selectBoardDetail(paramMap);
		
		model.addAttribute("data", result);
		
		return "boardDetail";
	}
	
	//삭제
	@RequestMapping(value="/deleteboard",method = {RequestMethod.POST})
	@ResponseBody
	public int deleteboard(@RequestParam(value="delseq[]") List<String> delseq) {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("delYn", "Y");
		int cnt = 0;
		String seq = null;
		
		//삭제할게 여러개 일때
		if(delseq.size() > 1) {
			for(int i = 0; i<delseq.size(); i++) {
				seq = delseq.get(i);
				paramMap.put("seq", seq);
				cnt = boardservice.updateBoard(paramMap);
			}
		//삭제할게 한개일때
		}else {
			seq = delseq.get(0);
			paramMap.put("seq", seq);
			cnt = boardservice.updateBoard(paramMap);
		}
		
		return cnt;
	}
	
	//글작성 / 수정페이지
	@RequestMapping(value="/viewboardwrite",method = {RequestMethod.GET})
	public String writeBoard(HttpServletRequest req, ModelMap model) {
		String seq = req.getParameter("seq");

		if(seq != null) {
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			
			paramMap.put("seq", seq);
			Map<String, Object> result = boardservice.selectBoardDetail(paramMap);
			
			model.addAttribute("data", result);
		}
		
		return "boardWrtie";
	}
	
	//글작성 / 수정
	@RequestMapping(value="/mergeBoard", method = {RequestMethod.POST})
	@ResponseBody
	public int mergeBoard(@RequestParam Map<String,Object> paramMap) {
		String seq = paramMap.get("seq").toString();
		int cnt = 0;
		
		if(seq == null || seq == "") {
			cnt = boardservice.insertBoard(paramMap);
		}else {
			cnt = boardservice.updateBoard(paramMap);
		}
		
		return cnt;
	}
	
}
