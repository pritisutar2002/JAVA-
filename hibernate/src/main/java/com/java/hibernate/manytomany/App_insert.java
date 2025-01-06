package com.java.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App_insert {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		Subject subject1 = new Subject();
		subject1.setName("SQL");
		subject1.setFees(10000);
		
		Subject subject2 = new Subject();
		subject2.setName("Java");
		subject2.setFees(15000);
		
		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(subject1);
		subjects.add(subject2);
		
		Student student1 = new Student();
		student1.setName("Priti");
		student1.setEmail("Priti@gmail.com");
		student1.setMobile(9970526821l);
		student1.setSubject(subjects);
		
		Student student2 = new Student();
		student2.setName("Shweta");
		student2.setEmail("Shweta@gmail.com");
		student2.setMobile(9970526822l);
		student2.setSubject(subjects);
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(subject2);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(student1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(student2);
		entityTransaction.commit();
		closeConnection();
		
	}
	
	public static void openConnection() {
		entityManagerFactory= Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
	}
	public static void closeConnection() {
		if(entityManagerFactory != null) {
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
