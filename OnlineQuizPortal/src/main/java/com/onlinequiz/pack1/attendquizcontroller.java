package com.onlinequiz.pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class attendquizcontroller {

	@RequestMapping("/attendquiz")
		public String display()
		{
			return "attendquiz";
		}
	
	
}
