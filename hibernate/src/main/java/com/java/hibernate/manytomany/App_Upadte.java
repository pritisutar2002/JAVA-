package com.java.hibernate.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.java.hibernate.User;

public class App_Upadte {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		openConncetion();
		Student student = entityManager.find(Student.class, 1);
		if (student != null) {
			student.setMobile(7387128934l);
			student.setEmail("pritisutar@gamil.com");
		} else {
			System.out.println("Student not found");
		}
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		closeConnection();
		
		
	}
	
	public static void openConncetion() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	public static void closeConnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		if(entityManager!=null) {
			entityManager.close();
		}
		if(entityTransaction !=null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}

}
