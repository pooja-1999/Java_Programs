package com.user.login;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("login")
public class UserBeanController {
	
		
			@Autowired
			UserBeanRepository userbeanrepository;
			
			@PostMapping("user")
			public UserBean adduser(@RequestBody UserBean userbean)
			{
				return userbeanrepository.save(userbean);
			}
			
			
			
			
			
			
			
			

	}



