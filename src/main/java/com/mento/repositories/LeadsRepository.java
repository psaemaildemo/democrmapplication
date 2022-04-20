package com.mento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mento.entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
