package com.icia.example03.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.example03.editor.*;
import com.icia.example03.vo.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
public class SampleController36 {
	@Autowired
	private CustomCategoryEditor cce;
	
	@InitBinder
	public void init(WebDataBinder wdb) {
		wdb.registerCustomEditor(Category.class, "category", cce);
	}
	
	@RequestMapping("/sample3/test6")
	public ModelAndView write(@ModelAttribute Board board) {
		log.info("{}", board);
		return null;
	}
}
