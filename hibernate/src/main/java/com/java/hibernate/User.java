package com.java.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String password;
	
}
