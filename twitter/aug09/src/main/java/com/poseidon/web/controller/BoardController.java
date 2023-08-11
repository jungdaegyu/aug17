package com.poseidon.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poseidon.web.dto.BoardDTO;
import com.poseidon.web.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) {
		List<BoardDTO> list = boardService.boardList();
		//System.out.println(list);
		model.addAttribute("list", list);		
		return "board";
	}
	
	@ResponseBody
	@PostMapping("/detail")
	public String detail(@RequestParam("bno") int bno ) {
		//System.out.println(bno);
		String content = boardService.detail(bno);
		
		JSONObject json = new JSONObject();
		json.put("content", content);
		
		return json.toString();
	}

	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest request) {
		//System.out.println(request.getParameter("title"));
		//System.out.println(request.getParameter("content"));
		BoardDTO dto = new BoardDTO();
		dto.setBtitle(request.getParameter("title"));
		dto.setBcontent(request.getParameter("content"));
		dto.setM_id("pororo");//임시로 members에 있는 id를 넣어주세요.
		
		int result = boardService.write(dto);
		System.out.println(result);
		
		return "redirect:/board";
	}
	
	
	
	
}
