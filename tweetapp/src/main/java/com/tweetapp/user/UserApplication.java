package com.tweetapp.user;

import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class UserApplication {
	private UserDao dao = new UserDao();
	private Boolean validateUser(User user) {
		boolean validUser=true;
		if(user != null) {
			if(user.getFirstName()!=null && user.getFirstName()!=""
				&& user.getGender()!= null && user.getGender()!=""
				
					) {
				
			}
		}
		return validUser;
	}
	public void register() throws IOException, SQLException, ClassNotFoundException, ParseException {
		Scanner userInput = new Scanner(System.in);
		Console console = System.console();
		User user = new User();
		System.out.println("----------User Register-------------");
		System.out.println("Enter First Name*");
		user.setFirstName(userInput.nextLine());
		System.out.println("Enter Last Name<optional>");
		user.setLastName(userInput.nextLine());
		System.out.println("Enter Gender*");
		user.setGender(userInput.nextLine());
		System.out.println("Enter DOB-(dd-MM-yyyy)<optional>");
		user.setDob(userInput.nextLine());
		System.out.println("Enter Email*");
		user.setEmail(userInput.nextLine());
		System.out.println("Enter Password*");
		user.setPassword(userInput.nextLine());
//		char[] pass = console.readPassword();
//		char[] pass = {'1','2','3'};
//		if(pass != null) {
//		user.setPassword(pass.toString());}
		dao.register(user);
		System.out.println("User Registered");
	}

	public void resetPassword() {
		System.out.println("Reset Password");
	}

	public void login() {
		System.out.println("Login");
	}

	public void logout() {
		System.out.println("Logout");
	}

	public void postTweet() {
		System.out.println("Post Tweet");
	}

	public void viewMyTweets() {
		System.out.println("My Tweets");
	}

	public void viewAllTweets() {
		System.out.println("All Tweets");
	}

	public void viewAllUsers() {
		System.out.println("All Users");
	}
}
