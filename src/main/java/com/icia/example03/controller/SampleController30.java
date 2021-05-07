package com.icia.example03.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class SampleController30 {
	// 작업 결과(내용) : Model
	// 화면 : View
	
	// 스프링 프로젝트 하부에는 한개의 서블릿 : DispatcherServlet
	// ModelAndWiew를 리턴하면 DispatcherServlet에서 아래와 유사한 작업을 수행
	// request.setAttribute(model);
	// rd.forward(view)
	@RequestMapping("/welcome")
	public ModelAndView test1() {
		return new ModelAndView("welcome").addObject("msg","hello");
	}
}
