package com.jspider.hibernate_OneToOne_Unidiretional.dao;

import com.jspider.hibernate_OneToOne_Unidiretional.entity.Pan;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonPanDao {
	
	public Person savePersonPanDao(Person person, Pan pan) {
		
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(pan);
			em.persist(person);
			et.commit();
			return person;
	}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
		
	}

}
