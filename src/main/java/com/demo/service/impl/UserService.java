package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	UserDao userDao;
	
	public List<User> getUsers() {
		
		List<User> users = userDao.select();
//		List<User> users = new ArrayList<User>();
		return users;
	}

	
}
