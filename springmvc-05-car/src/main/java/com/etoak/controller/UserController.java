package com.etoak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etoak.bean.User;
import com.etoak.service.UseerService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UseerService userService;
	
	@GetMapping("/getById")
	@ResponseBody
	public User getById(Integer id) {
		return userService.getById(1);
	}
}
