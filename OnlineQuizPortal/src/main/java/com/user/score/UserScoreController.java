package com.user.score;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("userscore")
public class UserScoreController {
	
	
	
		
			
				@Autowired
				UserScoreRepository userscorerepository;
				
				
				@GetMapping("alluserposition")
				public List<UserScore> getAlluserscores()
				{
					List<UserScore> userscores=(List<UserScore>) userscorerepository.findAll();
					return userscores;
				}
				
				@GetMapping("userposition/{id}")
				public Optional<UserScore> getStudentId(@PathVariable int id)
				{
					return userscorerepository.findById(id);
				}
				
				
				
				
				
				
				
				

		}




