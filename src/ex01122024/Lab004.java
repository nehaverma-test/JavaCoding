package ex01122024;

import java.util.Scanner;

public class Lab004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice");

		int choice = sc.nextInt();

		int workingHours = switch (choice) {

		case 1, 2, 3: {
			System.out.println("Days are Monday , Tuesday and Wednesday");

			yield 8;
		}

		case 4, 5: {

			System.out.println("Days are Thursday and Friday");
			yield 9;

		}

		default:
			yield 0;

		};

		System.out.println("Working hours -> " + workingHours);

	}

}
