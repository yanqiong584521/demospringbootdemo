package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.IUserService;

@RestController
public class UserController {

	@Resource
	IUserService userService;
	
	@RequestMapping("/getUsers")
	public List<User> getUsers(){
		
		List<User> users = userService.getUsers();
		return users;
	}
}
