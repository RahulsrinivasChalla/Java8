package com.jfs.optional;

import java.util.Optional;

public class User {
	
	int userID;
	
	String email;
	
	public User() {
		
	}

	public User(int userID, String email) {
		super();
		this.userID = userID;
		this.email = email;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmial() {
		return email;
	}

	public void setEmial(String emial) {
		this.email = emial;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", emial=" + email + "]";
	}
	
	public Optional<String> getUserById (int id) {
		if (id == this.userID) {
			return Optional.of(email);
		}else
		return Optional.empty();
	}

}
