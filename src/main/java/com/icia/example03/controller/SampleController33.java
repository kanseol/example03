package com.icia.example03.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.example03.vo.*;

import lombok.extern.slf4j.*;

@Slf4j
@RequestMapping("/sample3")
@Controller
public class SampleController33 {
	// get 방식 : 입력화면 보이기
	// jsp의 이름 : /WEB-INF/views/test3/input.jsp
	//  /WEB-INF/views/ + test3/input +	.jsp 
	@RequestMapping("/test3")
	public ModelAndView test3() {
		return new ModelAndView("test3/input");
	}

	// post 방식 : 이름과 나이를 입력받아 출력
	@RequestMapping(value="/test3", method=RequestMethod.POST)
	public ModelAndView test3(@ModelAttribute Sample sample) {
		return new ModelAndView("test3/result").addObject("sample", sample);
	}
}
