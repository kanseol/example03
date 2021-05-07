package com.icia.example03.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.example03.vo.*;

import lombok.extern.slf4j.*;

@Slf4j
@RequestMapping("/sample3")
@Controller
public class SampleController34 {
	@RequestMapping("/test4")
	public ModelAndView test4() {
		return new ModelAndView("test4/input");
	}
	@RequestMapping(value="/test4", method=RequestMethod.POST)
	public ModelAndView test4(@ModelAttribute Product product) {
		return new ModelAndView("test4/result").addObject("product", product);
	}
}
