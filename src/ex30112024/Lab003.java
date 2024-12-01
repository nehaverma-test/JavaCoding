package ex30112024;

import java.util.Scanner;

//Problem Statement
/*Write a nested if program to validate user login:

Conditions:
Check if the username is "TCSUser".
Check if the password is "TCS@2024".
If both are correct, print "Login Successful".
If username is correct but password is incorrect, print "Incorrect Password".
Else, print "Invalid Username".*/

public class Lab003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();

		System.out.println("Enter password");
		String password = sc.next();

		if (username.equals("TCSUser") && password.equals("TCS@2024")) {
			System.out.println("Login Sucessful");
		} 
		else if (username.equals("TCSUser") && !password.equals("TCS@2024")) {

			System.out.println("Incorrect Password");
			
		}
		else
			System.out.println("Invalid Username");

	}

}
