package ex01122024;

import java.util.Scanner;

public class Lab005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.next();
		
	String dayValue =	switch(day)
		{
		
	case "Mon", "Tue", "Wed" -> "Primary";	
	case "Thu", "Fri" -> "Secondry";
	
	default -> "Rest day";
		};
		
		System.out.println("Day is -> "+dayValue);

	}

}
