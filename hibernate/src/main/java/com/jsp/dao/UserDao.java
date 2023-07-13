package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class UserDao {
    public User save(User user) {
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction et=entityManager.getTransaction();
    	
    	if(user!=null ) {
    		et.begin();
    		entityManager.persist(user);
    		et.commit();
    	}
    	return user;
    }
    
    public User delete (User user) {
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction et=entityManager.getTransaction();
    	
    	User user2=entityManager.find(User.class, user.getId());
    	if(user2!=null) {
    		et.begin();
    		entityManager.remove(user);
    		et.commit();
    	}
    	return user2;
    }
    
    public User update (User user) {
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction et=entityManager.getTransaction();
    	
    	User user2=entityManager.find(User.class, user.getId());
    	if(user2!=null) {
    		et.begin();
    		entityManager.merge(user);
    		et.commit();
    	}
    	return user2;
    }
    
    
}
