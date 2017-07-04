package com.example.demo.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	@Value(value="${user.role}")
	private String userRole;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		return "hello World!";
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public Map<String,Object> get(@RequestParam String name){
		Map<String,Object> map=new HashMap<>();
		map.put("name", name);
		map.put("value", "hello world");
		map.put("userRole", userRole);
//		map.put("test", 100/0);
		return map;
	}
	@RequestMapping(value="/find/{name}",method=RequestMethod.GET)
	public User find(@PathVariable String name){
		/*User user=new User();
		user.setId(1);
		user.setName(name);
		user.setDate(new Date());*/
		User user=new User(2,name,new Date());
		return user;
	}
}
