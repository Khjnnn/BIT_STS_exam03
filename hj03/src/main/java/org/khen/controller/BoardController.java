package org.khen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

import org.khen.dto.PageDTO;
import org.khen.dto.PageUtil;
import org.khen.service.BoardService;
import org.khen.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	private BoardService service;
	
	@ResponseBody
	public List<BoardVO> listJSON(PageDTO dto){
		return service.getPageList(dto);
	}
	@GetMapping("/list")
	public void list(@ModelAttribute("pageDTO") PageDTO dto, Model model) {
		log.info("===== board list -------------");
		log.info(dto);
		log.info(service);
		model.addAttribute("sample", "Hello List");
		model.addAttribute("list", service.getPageList(dto));
		model.addAttribute("pageUtil", new PageUtil(dto, service.getTotal()));

	}

	@GetMapping("/register")
	public void registerGet() {
		log.info("===== register get ~~---");
	}
	
	@PostMapping("/register")
	public String registerPost() {
		log.info("===== register post ~~---");
		return "redirect:list";
	}	
}