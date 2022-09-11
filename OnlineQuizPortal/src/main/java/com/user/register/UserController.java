package com.user.register;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("register")
public class UserController {
	
		
			@Autowired
			UserRepository userrepository;
			
			
			@GetMapping("allusers")
			public List<User> getAllusers()
			{
				List<User> users=(List<User>) userrepository.findAll();
				return users;
			}
			
			@PostMapping("newuser")
			public User adduser(@RequestBody User user)
			{
				return userrepository.save(user);
			}
			
			
			
			
			
			
			
			

	}


