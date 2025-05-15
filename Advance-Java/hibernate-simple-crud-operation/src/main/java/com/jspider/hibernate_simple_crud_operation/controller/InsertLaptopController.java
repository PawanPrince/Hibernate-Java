package com.jspider.hibernate_simple_crud_operation.controller;

import java.time.LocalDate;

import com.jspider.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertLaptopController {

	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	Laptop laptop = new Laptop();
	laptop.setId(01);
	laptop.setName("hp");
	laptop.setColor("Purple");
	laptop.setPrice(1234);
	laptop.setRam("16GB");
	laptop.setPurchaseDate(LocalDate.parse("2025-05-05"));
	
	et.begin();
	
	
	em.persist(laptop); 
	
	et.commit();
	System.out.println("Data inserted Sucessfully");
	
	
	}
}
