package com.jspider.hibernate_OneToOne_Unidiretional.controller;

import java.time.LocalDate;

import com.jspider.hibernate_OneToOne_Unidiretional.dao.PersonPanDao;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Pan;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Person;

public class InsertPersonAndPanController {
	
	public static void main(String[] args) {
		
		PersonPanDao personPanDao = new PersonPanDao();
		Pan pan = new Pan();
		pan.setNumber("5783fd3D");
		pan.setAddress("Noida S-18");
		pan.setDob(LocalDate.parse("1999-08-18"));
		
		
		Person person =new Person();
		person.setId(24);
		person.setName("Pawan");
		person.setEmail("pawankumar@gmail.com");
		person.setPan(pan);
		
		personPanDao.savePersonPanDao(person, pan);
	}

}
