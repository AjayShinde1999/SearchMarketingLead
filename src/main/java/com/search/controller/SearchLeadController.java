package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.LeadDto;

@Controller
public class SearchLeadController {
	
	@Autowired
	private LeadRestClient leadRestClient;
	
	@RequestMapping("/searchLead")
	public String viewSearchLead() {
		return "search_lead";
	}
	
	@RequestMapping("/searchLeadById")
	public String searchLead(@RequestParam("id") long id,Model model) {
		LeadDto lead = leadRestClient.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}

}
