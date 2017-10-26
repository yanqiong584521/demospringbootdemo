package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.IMailService;

@Controller
@RequestMapping("/mail")
public class MailController {

	@Resource
	IMailService mailService;
	
	@RequestMapping("/sendMail")
	public void sendMail(){
		
		mailService.sendSimpleMail("neuq_3@163.com", "测试", "我TM就是测试一下");
	} 
}
