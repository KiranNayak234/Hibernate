package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class SaveUser {
	public static void main(String[] args) {
		User user = new User();
		UserService service=new  UserService();
		user.setId(5);
		user.setEmail("rajesh344@gmail.com");
		user.setName("rajesh");
		service.save(user);
		System.out.println("data stored");

	}
}
