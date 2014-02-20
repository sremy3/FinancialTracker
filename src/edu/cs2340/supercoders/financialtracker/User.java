package edu.cs2340.supercoders.financialtracker;

public class User {

	private String userName;
	private String pass;
	private String firstName;
	private String lastName;
	
	public User(String userName, String pass, String firstName, String lastName){
		this.userName = userName;
		this.pass = pass;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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

}
