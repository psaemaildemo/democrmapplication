package com.mento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mento.utilities.EmailUtil;

@Controller
public class SendEmailController {
	
	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "composeEmail";
	}
	
	@RequestMapping("/triggerEmail")
	public String triggerEmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("emailBody") String message, ModelMap modelMap) {
		
		emailUtil.sendEmail(to, subject, message);
		modelMap.addAttribute("msg", "Email is sent!!");
		return "composeEmail";
	}
}
