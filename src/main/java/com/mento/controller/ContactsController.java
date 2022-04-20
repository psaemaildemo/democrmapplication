package com.mento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mento.entities.Contacts;
import com.mento.entities.Leads;
import com.mento.service.ContactsService;
import com.mento.service.LeadsService;

@Controller
public class ContactsController {
	@Autowired
	private LeadsService leadService;
	
	@Autowired
	private ContactsService contactService;
	
	@RequestMapping("/converLead")
	public String converLead(@RequestParam("id") long id) {
		Leads lead = leadService.getLead(id);
		
		//Save lead to contacts
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setSource(lead.getSource());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteLead(lead.getId());
		
		return "leadConverted";
	}
	
	@RequestMapping("/getContacts")
	public String getContacts(ModelMap modelMap) {
		List<Contacts> contacts = contactService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		return "searchContactsResult";
	}
	
	@RequestMapping("/getContactInfo")
	public String getLeadInfo(@RequestParam("id") long id, ModelMap modelMap) {
		Contacts contact = contactService.getContact(id);
		modelMap.addAttribute("contact", contact);
		return "contactDetails";
	}
}
