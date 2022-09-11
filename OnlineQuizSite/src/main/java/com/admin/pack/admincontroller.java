package com.admin.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class admincontroller {
	@RequestMapping(value = "/updatepassword", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "updatepassword";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("passwordBean") PasswordBean passwordBean) 
	{
		if (passwordBean != null && passwordBean.getUserName() != null & passwordBean.getOldpassword() != null) {
			if (passwordBean.getToken().equals("ABCD124") && passwordBean.getOldpassword().equals("password")) {
				model.addAttribute("msg","New Password is updated!!!");
				return "adminpage";
			} else {
				model.addAttribute("error", "Password is not updated");
				return "adminpage";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "adminlogin";
		}
		
	}
	@RequestMapping("/adminpage")
	public String display()
	{
		return "adminpage";
	}	

	}

