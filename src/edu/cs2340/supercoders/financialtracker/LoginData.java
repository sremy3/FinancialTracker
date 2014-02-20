package edu.cs2340.supercoders.financialtracker;

import java.util.HashMap;

public class LoginData {
	
	private static HashMap<String, User> registry;

	public static void initializeRegistry(){
		registry = new HashMap<String, User>();
		User admin = new User("admin", "pass123", "Kevin", "Smith");
		registry.put(admin.getUserName(), admin);
	}
	
	public static boolean checkUser(String user, String pass){
		try{
			return registry.get(user).getPass().equals(pass);
		}	catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean checkAvailability(String user){
		if (registry.get(user) == null) return true;
		else return false;
	}
	
	public static void addNewUser(User u){
		registry.put(u.getUserName(), u);
	}
}
