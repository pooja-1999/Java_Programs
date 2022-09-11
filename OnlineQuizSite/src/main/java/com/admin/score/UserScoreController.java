package com.admin.score;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("userscore")
public class UserScoreController {
	
	
	
		
			
				@Autowired
				UserScoreRepository userscorerepository;
				
				
				@GetMapping("alluserscores")
				public List<UserScore> getAlluserscores()
				{
					List<UserScore> userscores=(List<UserScore>) userscorerepository.findAll();
					return userscores;
				}
				
				
				
				
				
				
				
				

		}




