package com.lzm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lzm.service.UserService;


@Controller
@RequestMapping("user")
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired 
	UserService userService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String forwardLogin(){
			return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginUser(String userName, String password){
		
		if (userService.hasMatchUser(userName, password) == null)
			return "login";
		else
			return "index";
	}
	
}
