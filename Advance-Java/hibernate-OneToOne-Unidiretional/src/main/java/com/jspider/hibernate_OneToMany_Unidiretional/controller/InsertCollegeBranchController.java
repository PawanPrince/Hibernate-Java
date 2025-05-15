package com.jspider.hibernate_OneToMany_Unidiretional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jspider.hibernate_OneToMany_Unidiretional.dao.CollegeBranchDao;
import com.jspider.hibernate_OneToMany_Unidiretional.entity.Branch;
import com.jspider.hibernate_OneToMany_Unidiretional.entity.College;

public class InsertCollegeBranchController {
	
	public static void main(String[] args) {
		
		CollegeBranchDao collegeBranchDao = new CollegeBranchDao();
		
		Branch branch1 = new Branch();
		branch1.setId(11);
		branch1.setName("Gk");
		branch1.setBlockname("A");
		
		Branch branch2 = new Branch();
		branch2.setId(12);
		branch2.setName("History");
		branch2.setBlockname("B");
		
		Branch branch3 = new Branch();
		branch3.setId(13);
		branch3.setName("Science");
		branch3.setBlockname("C");
		
		Branch branch4 = new Branch();
		branch4.setId(14);
		branch4.setName("Maths");
		branch4.setBlockname("D");
		
		List<Branch> branches = new ArrayList<Branch>(Arrays.asList(branch1,branch2,branch3, branch4));
		
		College college = new College();
		college.setId(201);
		college.setName("JNCT U");
		college.setEmail("jnctuniversity@gmail.com");
		college.setCollegeType("Engineering");
		college.setAddress("Indore");
		college.setBranches(branches);
		collegeBranchDao.saveCollegeBranchDao(college, branches);
		
		
		

	}

}
