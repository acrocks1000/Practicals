package question_3.section_A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CruiseTicket {
	
	// Declare Scanner object
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		// HashMap enters traveler details with 
		// key == 0 for crew members,
		// key ==1 for adults and 
		// key == 2 for children
		HashMap<Integer, ArrayList<Details>> totalList = new HashMap<Integer, ArrayList<Details>>();

		// Seperate arraylist for storing different types of Traveller details
		ArrayList<Details> crewdet = new ArrayList<Details>();
		ArrayList<Details> adultdet = new ArrayList<Details>();
		ArrayList<Details> childdet = new ArrayList<Details>();

		System.out.println("Welcome to the Cruise \n");
		System.out.print("Enter total number of travellers you wish to purchase tickets for : ");
		int travellers = sc.nextInt();
		while (travellers > 0) {
			sc.nextLine();
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("\nPlease enter your name : ");
			String nam = sc.nextLine();
			System.out.print("Please enter your age : ");
			int ag = sc.nextInt();
			sc.nextLine();

			// If Traveller's age less than 20 years then he/she is a child
			if (ag >= 20) {
				
				// check whether the traveller is a crew member or not
				System.out.print("\nAre you a crew Member (y/n)? : ");
				char choice = Character.toLowerCase(sc.next().charAt(0));
				System.out.println();
				
				if (choice == 'y') {
					crewdet.add(new CrewDetails(nam, ag));
				} else {
					adultdet.add(new AdultDetails(nam, ag));
				}
			} else {
				childdet.add(new ChildrenDetails(nam, ag));
			}

			travellers--;
		}

		// Store all data into a single HashMap
		totalList.put(0, crewdet);
		totalList.put(1, adultdet);
		totalList.put(2, childdet);

		// Total number of each category of travellers
		int crew = totalList.get(0).size();
		int adult = totalList.get(1).size();
		int children = totalList.get(2).size();
		int ticketPrice = (adult * 500) + (children * 250);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\nTotal number of personals on the cruise are : " + (crew + adult + children));

		// Display the Traveller details
		if (crew + adult + children > 0) {
			System.out.println("\nDetails of all travellers are : \n");
			if (crew > 0) {
				System.out.println("Crew Members : \n");
				for (int i = 0; i < crew; i++) {
					CrewDetails obj = (CrewDetails) totalList.get(0).get(i);
					obj.display();
					System.out.println();
				}
			}

			System.out.println();
			if (adult > 0) {
				System.out.println("Adults : \n");
				for (int i = 0; i < adult; i++) {
					AdultDetails obj = (AdultDetails) totalList.get(1).get(i);
					obj.display();
					System.out.println();
				}
			}

			System.out.println();
			if (children > 0) {
				System.out.println("Children : \n");
				for (int i = 0; i < children; i++) {
					ChildrenDetails obj = (ChildrenDetails) totalList.get(2).get(i);
					obj.display();
					System.out.println();
				}
			}
		}
		
		// Display the total amount to be paid for the tickets 
		System.out.println("\nYour total ticket price is " + ticketPrice);
		sc.close();

	}

}
