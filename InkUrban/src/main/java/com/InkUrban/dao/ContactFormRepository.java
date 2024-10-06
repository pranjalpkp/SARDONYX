package com.InkUrban.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InkUrban.Models.Contact_meeting;

public interface ContactFormRepository extends JpaRepository<Contact_meeting,Integer> {
	
	List <Contact_meeting> findByStatus(String status);

}
