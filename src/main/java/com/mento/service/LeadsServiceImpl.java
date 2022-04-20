package com.mento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mento.entities.Leads;
import com.mento.repositories.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {
	
	@Autowired
	private LeadsRepository leadRepo;

	@Override
	public void saveLead(Leads lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Leads> getLeads() {
		List<Leads> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Leads getLead(long id) {
		Optional<Leads> findById = leadRepo.findById(id);
		Leads lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);		
	}

}
