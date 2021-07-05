package com.tweetapp.user;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class User {
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String email;
	private String password;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dob
	 * @param email
	 * @param password
	 */
	public User(String firstName, String lastName, String gender, String dob, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.password = password;
	}
		
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() throws ParseException {
		String[] date1 = dob.split("-");
		LocalDate date = LocalDate.parse(date1[2]+"-"+date1[1]+"-"+date1[0]);
		System.out.println(date);
		return date;
	}
	public void setDob(String dob) {
		System.out.println(dob);
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
