package com.jspider.hibernate_simple_crud_operation.controller;

import java.util.List;

import com.jspider.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class NativeQueryController {

	public static void main(String[] args) {
	
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		List<Laptop> laptops = em.createNativeQuery("select * from laptop",Laptop.class).getResultList();
		
		if(!laptops.isEmpty()){
		for(Laptop laptop : laptops ) {
			System.out.println(laptop);	
		}
		  }else {
			  System.out.println("No Data");
		  }
		  
		System.out.println("======================================================");
		
		
		for(Laptop laptop : (List<Laptop>)em.createNativeQuery("select * from laptop",Laptop.class).getResultList() ) {
			System.out.println(laptop);	
		}

	}

}
