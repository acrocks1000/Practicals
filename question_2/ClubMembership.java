package question_2;

import java.util.Scanner;

public class ClubMembership {
	
	
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter \'1\' for Regular Membership,\nEnter \'2\' for Gold Membership,\nEnter \'3\' for Silver Membership");
		System.out.print("\nEnter the type of membership : ");
		int memtype = scan.nextInt();
		System.out.print("Enter total number of months of club membership : ");
		int nfm = scan.nextInt();
		switch(memtype) {
		case 1:
			RegularMembership regularCharges = new RegularMembership();
			regularCharges.noofMonths = nfm;
			System.out.println("Total Club Charges are : "+regularCharges.calculateBill());
			break;
		case 2:
			RegularMembership goldCharges = new GoldMember(nfm);
			System.out.println("Total Club Charges are : "+goldCharges.calculateBill());
			break;
		case 3:
			RegularMembership silverCharges = new SilverMember(nfm);
			System.out.println("Total Club Charges are : "+silverCharges.calculateBill());
			break;
		default:
			System.out.println("Invalid Input! ");
		}
	}
}




