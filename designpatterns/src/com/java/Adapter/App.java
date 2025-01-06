package com.java.Adapter;

public class App {
	public static void main(String[] args) {

		UserService userService = new UserService();
		userService.signUp();
		userService.logIn();

	}

}
