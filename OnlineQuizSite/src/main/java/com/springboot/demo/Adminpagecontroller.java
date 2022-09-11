package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Adminpagecontroller {
	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "adminlogin";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("adminBean") AdminBean adminBean) {
		if (adminBean != null && adminBean.getUserName() != null & adminBean.getPassword() != null) {
			if (adminBean.getUserName().equals("username") && adminBean.getPassword().equals("password")) {
				model.addAttribute("msg", adminBean.getUserName());
				return "adminpage";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "adminlogin";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "adminlogin";
		}
		
	}
	
	
}
