package com.jspider.hibernate_OneToMany_Unidiretional.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class College {
    @Id
	private int id;
	private String name;
	private String address;
	private String email;
	private String collegeType;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	@JoinTable(
	name = "mycollegeandmybranch",
	joinColumns = @JoinColumn(name = "mycollegeid"),
	inverseJoinColumns = @JoinColumn(name ="mybranchid")
	
	
			)
	
	List<Branch> branches;
}
