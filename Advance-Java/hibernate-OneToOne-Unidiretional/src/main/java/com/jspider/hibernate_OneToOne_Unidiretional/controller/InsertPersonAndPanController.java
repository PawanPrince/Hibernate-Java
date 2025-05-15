package com.jspider.hibernate_OneToOne_Unidiretional.controller;

import java.time.LocalDate;

import com.jspider.hibernate_OneToOne_Unidiretional.dao.PersonPanDao;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Pan;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Person;

public class InsertPersonAndPanController {
	
	public static void main(String[] args) {
		
		PersonPanDao personPanDao = new PersonPanDao();
		Pan pan = new Pan();
		pan.setNumber("Pr82U4");
		pan.setAddress("Noida S-27");
		pan.setDob(LocalDate.parse("1999-08-19"));
		
		
		Person person =new Person();
		person.setId(28);
		person.setName("Prince");
		person.setEmail("Prince@gmail.com");
//		person.setPan(pan);
		
		personPanDao.savePersonPanDao(person, pan);
	}

}
