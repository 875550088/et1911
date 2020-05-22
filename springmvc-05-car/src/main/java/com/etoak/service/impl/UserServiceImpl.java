package com.etoak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.bean.User;
import com.etoak.mapper.UserMapper;
import com.etoak.service.UseerService;

@Service
public class UserServiceImpl implements UseerService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getById(Integer id) {
		return userMapper.getById(id);
	}
}
