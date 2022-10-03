package question_3.section_B;

import java.util.Scanner;

public class ToothPaste {
	private static Scanner scan;
	String name;
	int age, brand;
	static int colgate = 0, pepsodent = 0, patanjali = 0, dabar_red = 0;
	char cat;

	public ToothPaste() {
		scan = new Scanner(System.in);
		System.out.print("Enter your name : ");
		this.name = scan.nextLine();
		System.out.print("Enter your age : ");
		this.age = scan.nextInt();
		System.out.print("Enter your category ('c' for children, 'm' for men and 'w' for women) : ");
		this.cat = scan.next().charAt(0);
		System.out.print(
				"Enter 1 For colgate, \nEnter 2 For pepsodent, \nEnter 3 For patanjali, \nEnter 4 For dabar red");
		this.brand = scan.nextInt();

		switch (brand) {
		case 1:
			colgate++;
			break;
		case 2:
			pepsodent++;
			break;
		case 3:
			patanjali++;
			break;
		case 4:
			dabar_red++;
			break;
		default:
			System.out.println("\nPlease Enter a valid brand value! \n");
		}

	}

	public static String MostPopularBrand() {
		int[] mpb = { colgate, pepsodent, patanjali, dabar_red };
		int max = 0;
		int index = 0;
		for (int i = 0; i < 4; i++) {
			if (mpb[i] >= max) {
				max = mpb[i];
				index = i;
			}
		}
		switch (index + 1) {
		case 1:
			return "Most Popular Brand is Colgate, total = " + colgate + " users.";
		case 2:
			return "Most Popular Brand is Pepsodent, total = " + pepsodent + " users.";
		case 3:
			return "Most Popular Brand is Patanjali, total = " + patanjali + " users.";
		case 4:
			return "Most Popular Brand is Dabar Red, total = " + dabar_red + " users.";
		default:
			return "Please Enter a valid input value! ";
		}
	}
}
