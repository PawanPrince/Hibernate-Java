package com.jspider.hibernate_simple_crud_operation.controller;

import com.jspider.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetLaptopByIdController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		
		Laptop laptop = em.find(Laptop.class, 3);
		
		if(laptop!=null) {
			System.out.println(laptop);
		}else {
			System.out.println("Id is not found! Please recheck your code");
		}
		
	}

}
