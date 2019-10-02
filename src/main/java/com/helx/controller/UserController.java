package com.helx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helx.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	@Autowired
	UserService UserService;
	
//	@Value("${server.port}")
//	String port;
	
	@RequestMapping("/getUser")
	public String getUser() {
		log.info("1");
		String str = UserService.getUser();
		log.info("2");
		return "username:"+str;
	}
	
	@RequestMapping("/getHello")
	public String getHello() {
		return "hello12";
	}
	@RequestMapping("/getFuck")
	public String getFuck() {
		return "fuck12";
	}
}
