package com.icia.example03.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import lombok.extern.slf4j.*;

@Slf4j
@RequestMapping("/sample3")
@Controller
public class SampleController32 {
	// get 방식으로 test2.jsp를 보여주고 
	@RequestMapping("/test2")
	public ModelAndView test2() {
		return new ModelAndView("test2");
	}
	
	// post 방식으로 숫자 2개를 전달받아 더한 다음 test2result.jsp에 출력
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public ModelAndView test2(@RequestParam int val1, @RequestParam int val2) {
		int result = val1 + val2;
		return new ModelAndView("test2result").addObject("result",result);
	}
}
