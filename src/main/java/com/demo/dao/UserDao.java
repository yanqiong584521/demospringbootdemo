package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.entity.User;

public interface UserDao {

	public List<User> select();
	
	public User getByUserId(@Param("userId") String userId);
	
}
