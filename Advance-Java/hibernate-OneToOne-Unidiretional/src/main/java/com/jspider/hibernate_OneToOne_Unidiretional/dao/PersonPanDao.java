package com.jspider.hibernate_OneToOne_Unidiretional.dao;

import com.jspider.hibernate_OneToOne_Unidiretional.entity.Pan;
import com.jspider.hibernate_OneToOne_Unidiretional.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PersonPanDao {
	
	public Person savePersonPanDao(Person person, Pan pan) {
		
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
//			em.persist(pan);
			em.persist(person);
			et.commit();
			return person;
	}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
		
	}
	public boolean deletePanByNumber(String panNumber) {
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Pan pan = em.find(Pan.class, panNumber);
		if(pan!=null) {
			try {
				et.begin();
				Query query =  em.createNativeQuery("select * from person where pan_number=?1", Person.class);
				query.setParameter(1, panNumber);
				Person person = (Person) query.getSingleResult();
				
				if(person!=null) {
					person.setPan(null);
					em.merge(person);
				}
				em.remove(pan);
				et.commit();
				return true;
				
			  }catch(Exception e){
				
				e.printStackTrace();
				return false;
				
				
			}
		}
		return false;
	}

}
