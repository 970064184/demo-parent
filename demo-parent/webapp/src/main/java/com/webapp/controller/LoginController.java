package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="/index")
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("/index");
		mv.addObject("hello", "hi");
		return mv;
	}
	@RequestMapping(value="/userIndex")
	public ModelAndView userIndex(){
		ModelAndView mv=new ModelAndView("/common/userIndex");
		mv.addObject("userIndex", "userIndex");
		return mv;
	}
}
