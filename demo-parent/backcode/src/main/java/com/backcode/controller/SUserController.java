package com.backcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backcode.model.SUser;
import com.backcode.service.SUserService;
import com.common.model.Feedback;
import com.common.model.MediaType;

@RestController
@RequestMapping("/sUser")
public class SUserController {
	@Autowired
	private SUserService sUserService;
	
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<SUser> findAll(){
		List<SUser> list=sUserService.findAll();
		return list;
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_UTF8,produces=MediaType.APPLICATION_JSON_UTF8)
	public String addUser(SUser sUser){
		Feedback feedback=new Feedback();
		feedback.error("保存失败");
		return "";
	}
	
	
}
