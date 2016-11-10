package com.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

import com.user.model.*;
import com.user.form.*;
import com.user.service.*;

@Controller
@RequestMapping("/login")
public class LoginContrtoller {
	
	@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "login";
	}

	
	/*public ModelAndView getRegisterForm(@ModelAttribute("user") Users user,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("Register Form");
		return new ModelAndView("home", "model", model);
	}*/
	@RequestMapping(method = RequestMethod.POST)
	public String processForm(/*@Valid LoginForm loginForm*/ @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result,
			Map<String,Object> model) {

		
		if (result.hasErrors()) {
			return "psw";
		}
		
		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginform";
		}
		*/
		boolean userExists = loginService.checkLogin(loginForm.getEmail(),
				loginForm.getPassword());
		if(userExists){
			model.put("loginForm",loginForm);
			return "success";
		}else{
			result.rejectValue("email","invaliduser");
			return "Check";
		}

	}
	

}
