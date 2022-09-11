package com.admin.user;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userdetails")
public class UserController {
	
		
			@Autowired
			UserRepository userrepository;
			
			
			@GetMapping("allusers")
			public List<User> getAllusers()
			{
				List<User> users=(List<User>) userrepository.findAll();
				return users;
			}
			
			
			
			
			
			
			
			

	}


