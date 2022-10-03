package question_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProduct {
	// Declare a static scanner class variable
	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		// Initialize scanner
		scan = new Scanner(System.in);
		ArrayList<Product> prod;

		// Load the data into the productList
		ProductLoader.loadProduct();

		String newtemp = "\n";
		prod = ProductLoader.getProductList();

		// Enter product ID from the user
		System.out.print("Enter the product ID : ");
		String prodID = scan.next();

		// Check whether the product with the entered ProductID exits in the file or not
		Product checkProduct = ProductLoader.searchProduct(prodID);

		// If not present enter new details from the user
		if (checkProduct == null) {
			System.out.print("Enter Product Name : ");
			String pnm = scan.next();
			System.out.print("Enter Price : ");
			String pr = scan.next();
			System.out.print("Enter Quantity : ");
			String qt = scan.next();
			newtemp += prodID + "," + pnm + "," + pr + "," + qt;

			// Add new details to the file
			TestProduct.addProductData(newtemp);
			ProductLoader.loadProduct();
			System.out.println("\nProduct Added : ");
			checkProduct = ProductLoader.searchProduct(prodID);
			TestProduct.getOutput(checkProduct);
		} else {

			// If ProductID exits then display the output
			TestProduct.getOutput(checkProduct);
		}

		// Display the total number of products
		prod = ProductLoader.getProductList();
		System.out.println("Total number of Products : " + prod.size());
	}

	public static void addProductData(String inputData) throws IOException {

		// Write data in append mode using the 'true' argument
		FileWriter fw = new FileWriter("Practical/question_1/productDetails.txt", true);

		// Write data into the file
		fw.write(inputData);
		fw.close();
	}

	public static void getOutput(Product checkProduct) {
		System.out.println("\nProduct ID : " + checkProduct.getProductID());
		System.out.println("Product Name : " + checkProduct.getProductName());
		System.out.println("Price : " + checkProduct.getPrice());
		System.out.println("Quantity : " + checkProduct.getQuantity());
	}

}
