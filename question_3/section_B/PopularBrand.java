package question_3.section_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PopularBrand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// HashMap to store the details of all the suveyed people
		Map<Integer, ToothPaste> survey = new HashMap<Integer, ToothPaste>();
		System.out.print("Enter the Number of people in the survey : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			survey.put(i, new ToothPaste());
		}
		
		// Display the survey results
		System.out.println("Survey : ");
		for (Map.Entry<Integer, ToothPaste> entry : survey.entrySet()) {
			int key = entry.getKey();
			ToothPaste b = entry.getValue();
			System.out.println();
			System.out.println(
					"Name: " + b.name + "\nAge: " + b.age + "\nCategory : " + b.cat + "\nBrand: " + b.brand);
		}
		
		// Display the most popular brand
		System.out.println("\n"+ToothPaste.MostPopularBrand());
		sc.close();
	}

}
