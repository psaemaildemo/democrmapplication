package com.mento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mento.entities.Leads;
import com.mento.service.LeadsService;

@Controller
public class LeadsController {
	@Autowired
	private LeadsService leadService;
	
	@RequestMapping("/leads")
	public String showLeadsPage() {
		return "saveLeads";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Leads lead, ModelMap modelMap) {
		leadService.saveLead(lead);
		modelMap.addAttribute("msg", "Lead is saved!!");
		return "saveLeads";
	}
	
	@RequestMapping("/getAllLeads")
	public String getAllLeads(ModelMap modelMap) {
		List<Leads> leads = leadService.getLeads();
		modelMap.addAttribute("leads", leads);
		return "searchLeadsResult";
	}
	
	@RequestMapping("/getLeadInfo")
	public String getLeadInfo(@RequestParam("id") long id, ModelMap modelMap) {
		Leads lead = leadService.getLead(id);
		modelMap.addAttribute("lead", lead);
		return "leadDetails";
	}
}
