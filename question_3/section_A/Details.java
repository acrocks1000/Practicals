package question_3.section_A;

import java.util.Scanner;

// Parent Class
public class Details {
	static Scanner scan;
}

// Adult Details
class AdultDetails extends Details {
	int tno, age;
	String name, address;
	long phoneno;

	public AdultDetails(String name, int age) {
		this.name = name;
		this.age = age;
		getInput();
	}
	
	// Get input from the user
	public void getInput() {
		scan = new Scanner(System.in);
		System.out.print("Enter your ticket no : ");
		this.tno = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter your address : ");
		this.address = scan.nextLine();
		System.out.print("Enter your phone no : ");
		this.phoneno = scan.nextLong();
	}

	// Display the output to the user
	public void display() {
		System.out.println("Ticket no : " + this.tno
							+"Name : " + this.name
							+"Age : " + this.age
							+"Phone no : " + this.phoneno
							+"Address : " + this.address
							+"The ticket is bought for Rs 500.");

	}

}

// Children Details
class ChildrenDetails extends Details {
	int tno, age;
	String name;

	// parameterized constructor
	public ChildrenDetails(String name, int age) {
		this.name = name;
		this.age = age;
		getInput();
	}

	// Get input from the user
	public void getInput() {
		scan = new Scanner(System.in);
		System.out.print("Enter your ticket no : ");
		this.tno = scan.nextInt();
	}

	// Display the output to the user
	public void display() {
		System.out.println("Ticket no : " + this.tno
							+"Name : " + this.name
							+"Age : " + this.age
							+"The ticket is bought for Rs 250.");
	}
}

// Crew Details
class CrewDetails extends Details {
	int idno, age;
	String name, trip_name;

	// parameterized constructor
	public CrewDetails(String name, int age) {
		this.age = age;
		this.name = name;
		getInput();

	}

	// Get the input from the user
	public void getInput() {
		scan = new Scanner(System.in);
		System.out.print("Enter your ID no : ");
		this.idno = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter your trip name : ");
		this.trip_name = scan.nextLine();
	}

	// display the output to the user
	public void display() {
		System.out.println("ID no : " + this.idno
							+"\nName : " + this.name
							+"\nAge : " + this.age
							+"\nTrip Name : " + this.trip_name
							+"\nThe ticket for crew members is free.");
	}
}
