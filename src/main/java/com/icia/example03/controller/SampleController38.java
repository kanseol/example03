package com.icia.example03.controller;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.support.*;

@Controller
@RequestMapping("/sample3")
public class SampleController38 {
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView join(HttpSession session, RedirectAttributes ra) {
		session.setAttribute("session_msg", "가입을 환영합니다");
		
		// 이동 후 자동으로 삭제
		ra.addFlashAttribute("redirect_msg", "리다이렉트 메세지: 가입을 환영합니다");
		return new ModelAndView("redirect:/sample3/login");
	}
}
