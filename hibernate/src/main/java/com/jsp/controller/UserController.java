package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class UserController {
	public static void main(String[] args) {
		User user = new User();
//		UserService service = new UserService();
		user.setId(2);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction et=entityManager.getTransaction();
    	
    	User user2=entityManager.find(User.class, user.getId());
    	if(user2!=null) {
    		et.begin();
    		entityManager.remove(user2);
    		et.commit();
    		System.out.println("done");
    	}
	}
}
