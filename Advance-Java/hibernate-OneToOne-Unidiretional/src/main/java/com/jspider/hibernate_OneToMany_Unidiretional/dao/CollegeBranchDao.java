package com.jspider.hibernate_OneToMany_Unidiretional.dao;

import java.util.List;

import com.jspider.hibernate_OneToMany_Unidiretional.entity.Branch;
import com.jspider.hibernate_OneToMany_Unidiretional.entity.College;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CollegeBranchDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public College saveCollegeBranchDao(College college , List<Branch> branches) {
		try {
			et.begin();
//			for(Branch branch : branches ) {
//				
//				em.persist(branch);
//			}
			
			em.persist(college);
			et.commit();
			
		return college;
		
	}catch (Exception e) {
		e.printStackTrace();
		return null;
	}

}
	
}
