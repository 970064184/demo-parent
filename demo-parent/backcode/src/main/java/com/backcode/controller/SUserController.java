package com.backcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backcode.model.SUser;
import com.backcode.service.SUserService;

@RestController
@RequestMapping("/sUser")
public class SUserController {
	@Autowired
	private SUserService sUserService;
	
	@RequestMapping("/findAll")
	public List<SUser> findAll(){
		List<SUser> list=sUserService.findAll();
		return list;
	}
	
}
