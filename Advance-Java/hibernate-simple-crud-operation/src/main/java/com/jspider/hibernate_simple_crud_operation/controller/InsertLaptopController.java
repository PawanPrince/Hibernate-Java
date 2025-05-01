package com.jspider.hibernate_simple_crud_operation.controller;

import jakarta.persistence.Persistence;

public class InsertLaptopController {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("hibernate");
	}
}
