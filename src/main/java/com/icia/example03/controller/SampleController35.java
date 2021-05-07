package com.icia.example03.controller;

import java.time.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.example03.editor.*;
import com.icia.example03.vo.*;

import lombok.extern.slf4j.*;

@Slf4j
@RequestMapping("/sample3")
@Controller
public class SampleController35 {
	// pno=11&name=음료수&sales=1
	@RequestMapping("/test51")
	public ModelAndView test1(@RequestParam int pno, @RequestParam String name, @RequestParam boolean sales) {
		log.info("{}", sales);
		return null;	
	}
	
	// urlencoded 파라미터를 적절한 객체로 변환해주는 표준 : PropertyEditor
	// 스프링이 PropertyEditor인터페이스를 구현해서 몇개의 에디터를 제공 -> 자동 변환
	// LocalDate의 경우 스프링이 제공하지 않는다 -> 내가 만든 다음 등록
	@RequestMapping("/test52")
	public ModelAndView test2() {
		return new ModelAndView("test5/input");
	}
	
	// pno=11&name=drink$price=1500&productday=2020-11-20
	@RequestMapping(value="/test52", method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute Product2 product) {
		return new ModelAndView("test5/result").addObject("product", product);
	}
	
	// 내가 만든 에디터를 WebDataBinder에 등록
	@InitBinder
	public void init(WebDataBinder wdb) {
		// 타입으로 지정 -> 모든 LocalDate에 대해 적용
		// wdb.registerCustomEditor(getClass(), null);
		
		// 필드명으로 지정 -> LocalDate중에서 productday에 대해 적용
		wdb.registerCustomEditor(LocalDate.class, "productday", new CustomLocalDateEditor());
	}
}
