package com.jspider.hibernate_OneToMany_Unidiretional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Branch {
	@Id
	private int id;
	private String name;
	private String blockname;

}
