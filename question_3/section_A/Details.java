package question_3.section_A;

import java.util.Scanner;

public class Details {
	static Scanner scan;
}

class AdultDetails extends Details{
	int tno, age;
	String name, address;
	long phoneno;
	
	public AdultDetails(String name, int age) {
		this.name = name;
		this.age = age;
		getInput();
	}
	
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
	
	public void display() {
		System.out.println("Ticket no : "+this.tno);
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone no : "+this.phoneno);
		System.out.println("Address : "+this.address);
		System.out.println("The ticket is bought for Rs 500.");

	}

}

class ChildrenDetails extends Details {
	int tno, age;
	String name;
	
	public ChildrenDetails(String name, int age) {
		this.name = name;
		this.age = age;
		getInput();
	}
	
	public void getInput() {
		scan = new Scanner(System.in);
		System.out.print("Enter your ticket no : ");
		this.tno = scan.nextInt();
	}
	
	public void display() {
		System.out.println("Ticket no : "+this.tno);
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("The ticket is bought for Rs 250.");

	}
	

}

class CrewDetails extends Details {
	int idno,age;
	String name, trip_name;
	
	
	public CrewDetails(String name, int age) {
		this.age = age;
		this.name = name;
		getInput();
		
	}

	public void getInput() {
		scan = new Scanner(System.in);
		System.out.print("Enter your ID no : ");
		this.idno = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter your trip name : ");
		this.trip_name = scan.nextLine();
//		scan.close();

	}
	
	public void display() {
		System.out.println("ID no : "+this.idno);
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Trip Name : "+this.trip_name);
		System.out.println("The ticket for crew members is free.");
	}
}


