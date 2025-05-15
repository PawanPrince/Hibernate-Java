package com.jspider.hibernate_OneToOne_Unidiretional.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pan {
	
	@Id
	private String number;
	private String address;
	private LocalDate dob;

}
