package com.coderscampus.week5;

public class Exercise1A {

	public static void main(String[] args) {


//		User user = new User();
//		User user = new User("HeroDude", "S3cr3t", "Timothy van den Berg");
		
		java.util.Scanner scannerVar = new java.util.Scanner(System.in);
		
		String newUsername;
		String newPassword;
		String newName;
		
		System.out.println("Type in your username");
		newUsername = scannerVar.nextLine();
		
		System.out.println("type in your password and store it in a safe place, like KeePass");
		newPassword = scannerVar.nextLine();
		
		System.out.println("Type in your full name");
		newName = scannerVar.nextLine();
		
		
		
		User user = new User(newUsername, newPassword, newName);
		
		System.out.println("Congratulations " + user.getUsername() + "! your account has been created.");
		
		scannerVar.close();
		
	}
}
