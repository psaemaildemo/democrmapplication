package com.mento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mento.entities.Contacts;
import com.mento.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
	@Autowired
	private ContactsRepository contactRepo;
	
	@Override
	public void saveContact(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts getContact(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
