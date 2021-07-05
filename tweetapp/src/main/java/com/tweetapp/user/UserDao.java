package com.tweetapp.user;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Properties;

public class UserDao {

	private Connection connectDB() throws SQLException, IOException, ClassNotFoundException {

		FileReader reader = new FileReader("src/main/resources/application.properties");
		Properties prop = new Properties();
		prop.load(reader);

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("dbURL"));
		

		String dbURL = prop.getProperty("dbURL");
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dbURL, userName, password);

		return conn;

	}

	public void register(User user) throws IOException, SQLException, ClassNotFoundException, ParseException {
		Connection connect = connectDB();
		
		String sql = "INSERT INTO users (first_name, last_name, gender, dob, password, email) VALUES (?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement = connect.prepareStatement(sql);
		statement.setString(1, user.getFirstName());
		statement.setString(2, user.getLastName());
		statement.setString(3, user.getGender());
		statement.setDate(4, java.sql.Date.valueOf(user.getDob()));
		statement.setString(5, user.getPassword());
		statement.setString(6, user.getEmail());
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		}
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
