package com.java.hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDAO1 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager  entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		
		User userDTO = new User();
		userDTO.setId(3);
		userDTO.setName("Radha");
		userDTO.setEmail("radha@gmail.com");
		userDTO.setMobile(9876543222l);
		userDTO.setPassword("radha@1234");

		openConnection();
		entityTransaction.begin();
		entityManager.persist(userDTO);
		entityTransaction.commit();
		closeConnection();
		System.out.println(" Record inserted successfully");
		
	}
	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction(); 
	}
	private static void closeConnection() {
		if (entityManagerFactory != null)
			entityManagerFactory.close();
		if (entityManager != null)
			entityManager.close();
		if (entityTransaction != null) {
			if (entityTransaction.isActive())
				entityTransaction.rollback();
		}
	}

}
