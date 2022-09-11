package com.admin.createquiz;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("createquiz")
public class QuizController {
	
		@Autowired
		QuizRepository quizrepository;
		
		
		@GetMapping("all")
		public List<Quiz> getAllQuizqus()
		{
			List<Quiz> quizqus=(List<Quiz>) quizrepository.findAll();
			return quizqus;
		}
		
		
		@PostMapping("addquiz")
		public Quiz addStudent(@RequestBody Quiz quiz)
		{
			return quizrepository.save(quiz);
		}
		
		
		
		
		

}
