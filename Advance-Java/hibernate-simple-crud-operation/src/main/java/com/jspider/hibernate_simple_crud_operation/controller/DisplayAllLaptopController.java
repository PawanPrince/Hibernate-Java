package com.jspider.hibernate_simple_crud_operation.controller;

import java.util.List;

import com.jspider.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllLaptopController {

	public static void main(String[] args) {
	 
	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	
	EntityTransaction et = em.getTransaction();
//	
//	Query query= em.createQuery("from Laptop");
//	
//	List<Laptop> laptops = query.getResultList();
//	
//	if(!laptops.isEmpty()) {
//		for(Laptop laptop : laptops) {
//			System.out.println(laptop);
//		}
//	}
          
	//! way 2
	
//	Query query = em.createQuery("SELECT a from Laptop a where a.price=?1");
////	                                                                   :abc
//	query.setParameter(1, 37423);
////	                  "abc"
//	try {
//		Laptop laptop = (Laptop) query.getSingleResult();
//		System.out.println(laptop);
//	} catch (Exception e) {
//		e.printStackTrace();
//		System.out.println("There is no Product with this Price...");
//	}
	
	//way to delete
	
//	Query query = em.createQuery("delete from Laptop a where a.price=:abc");
//	query.setParameter("abc", 7873); 
//	
//	et.begin();
//	int a = query.executeUpdate();
//	et.commit();
//	
//	String msg = a!= 0?"deleted":"given id not found";
//	System.out.println(msg);
	
//	update 
	
	Query query = em.createQuery("update Laptop a set a.price=:p where a.name=:n");
	query.setParameter("p", 123); 
	query.setParameter("n", "Dell"); 
	
	et.begin();
	int a = query.executeUpdate();
	et.commit();
	
	String msg = a!= 0?"updated":"given id not found";
	System.out.println(msg);
	

	
	
	  
    }
//	Update Price by Percentage

}

//}
