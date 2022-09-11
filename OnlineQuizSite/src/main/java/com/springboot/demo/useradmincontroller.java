package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class useradmincontroller {

	@RequestMapping("/onlineQuizPortal")
		public String display()
		{
			return "adminuser";
		}	
	
	
	
}
