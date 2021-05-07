package com.icia.example03.controller;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@RequestMapping("/sample3")
@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session) {
		if(session.getAttribute("session_msg")!=null) {
			String session_msg = (String)session.getAttribute("session_msg");
			session.removeAttribute("session_msg");
			return new ModelAndView("login").addObject("session_msg", session_msg);
		} else {
			return new ModelAndView("login");
		}
	}
}
