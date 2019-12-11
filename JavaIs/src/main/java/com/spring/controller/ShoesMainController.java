package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoesMainController {
	
	//메인화면이동
	@RequestMapping(value = "shoesMainList.do")
	public String ShoesMainList() {
		
		return "/jsp/shoes_main_list.jsp";
	}
}
