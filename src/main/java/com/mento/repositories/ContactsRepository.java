package com.mento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mento.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
