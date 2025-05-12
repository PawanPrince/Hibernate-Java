package com.jspider.hibernate_OneToOne_Unidiretional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne
	private Pan pan;
 }
