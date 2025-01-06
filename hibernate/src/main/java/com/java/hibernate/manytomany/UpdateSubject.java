package com.java.hibernate.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateSubject {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		openConnection();
		Subject subject= entityManager.find(Subject.class, 1);
		if(subject!=null) {
			subject.setFees(12000);
		}else {
			System.out.println("Subject is not exist");
		}
		
		entityTransaction.begin();
		entityManager.persist(subject);
		entityTransaction.commit();
		closeConnection();
		
	}
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
	}
	public static void closeConnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		if(entityManager!=null) {
			entityManager.close();
		}
		if(entityTransaction!=null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}

}
