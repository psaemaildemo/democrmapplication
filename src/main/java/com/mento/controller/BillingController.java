package com.mento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mento.entities.Contacts;
import com.mento.service.ContactsService;

@Controller
public class BillingController {
	@Autowired
	private ContactsService contactService;
	
	@RequestMapping("createBill")
	public String createBill(@RequestParam("customerId") long id) {
		System.out.println(id);
		return "newBillCreation";
	}
}
