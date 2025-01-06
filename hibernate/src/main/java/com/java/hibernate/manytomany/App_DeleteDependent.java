package com.java.hibernate.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App_DeleteDependent {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		openConnection();
		Student student= entityManager.find(Student.class, 2);
		if(student!=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		}else {
			System.out.println("Student not found");
		}
		closeConnection();
		
	}
	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	public static void closeConnection() {
		if(entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if(entityManager!=null){
			entityManager.close();
		}if(entityTransaction!=null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
}
