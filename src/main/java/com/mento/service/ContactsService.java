package com.mento.service;

import java.util.List;

import com.mento.entities.Contacts;

public interface ContactsService {
	public void saveContact(Contacts contact);
	public List<Contacts> getContacts();
	public Contacts getContact(long id);
}
