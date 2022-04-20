package com.mento.service;

import java.util.List;

import com.mento.entities.Leads;

public interface LeadsService {
	public void saveLead(Leads lead);
	public List<Leads> getLeads();
	public Leads getLead(long id);
	public void deleteLead(long id);
}
