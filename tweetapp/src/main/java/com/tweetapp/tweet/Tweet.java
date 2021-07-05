package com.tweetapp.tweet;

public class Tweet {
	private String userName;
	private String tweet;
	/**
	 * @param userName
	 * @param tweet
	 */
	public Tweet(String userName, String tweet) {
		super();
		this.userName = userName;
		this.tweet = tweet;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
}
