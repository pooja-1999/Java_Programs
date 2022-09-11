package com.quiz.qus;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("questions")
public class QuestionController {
	
	@Autowired
	QuestionRepository questionrepository;
	
	
	@GetMapping("allquestions")
	public List<Question> getAllQuestion()
	{
		List<Question> question=(List<Question>) questionrepository.findAll();
		return question;
	}
	
	
	@PostMapping("addQuestions")
	public Question addQuestion(@RequestBody Question question)
	{
		return questionrepository.save(question);
	}
	
	

	
}
