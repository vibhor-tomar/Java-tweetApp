package com.tweetapp;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import com.tweetapp.user.UserApplication;
import com.tweetapp.user.UserDao;

public class App 
{
    public static void main( String[] args ) throws IOException, SQLException, ClassNotFoundException, ParseException
    {
    	UserApplication app = new UserApplication();
    	app.register();
        System.out.println( "Hello World!" );
    }
}
