package com.jspider.hibernate_simple_crud_operation.controller;

import com.jspider.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateLaptopByIdController {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		 Laptop laptop = em.find(Laptop.class, 2);
		
		
		if(laptop!=null) {
		laptop.setPrice(87889);
		et.begin();
		em.merge(laptop);
		et.commit();
		
		System.out.println("Data Updated!!");
		}else {
			System.out.println("Id is not found! Please recheck your code");
		}
		
	}

}
