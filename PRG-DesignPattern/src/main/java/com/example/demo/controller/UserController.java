package com.example.demo.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@RequestMapping(value = {"/", "createUserAcc"}, method = RequestMethod.GET)
	public String loadUserForm(Model model) {
		model.addAttribute("userModel", new User());
		
		return "createUserAcc";
	}
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUserAcc(@ModelAttribute("userModel") User user, Model model) {
	logger.info(" user form submitted :: " + user);
	model.addAttribute("msg","Account created successfully");
	return "createUserAcc";
	}
}
