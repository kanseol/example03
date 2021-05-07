package com.icia.example03.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.example03.editor.*;
import com.icia.example03.vo.*;

import lombok.extern.slf4j.*;

@Slf4j
@RequestMapping("/sample")
@Controller
public class SampleController37 {
	@Autowired
	private CustomLocalDateEditor clde;
	// 레벨 에디터 주입
	
	@InitBinder
	public void init(WebDataBinder wdb) {
		wdb.registerCustomEditor(LocalDate.class, "birthday", clde);
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView gjoin(@ModelAttribute User user) {
		log.info("{}", user);
		return null;
	}
}
