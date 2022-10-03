package question_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductLoader {
	private static ArrayList<Product> products;
	
	public static void loadProduct() throws IOException {
		products = new ArrayList<Product>();
		File file = new File("Practical/question_1/productDetails.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			String[] ProductDetails= line.split(",");
			
			products.add(new Product(ProductDetails[0], ProductDetails[1], Float.valueOf(ProductDetails[2]), Integer.valueOf(ProductDetails[3])));
		}
		fr.close();
	}
	
	public static ArrayList<Product> getProductList() {
		return products;
		
	}
	
	public static Product searchProduct(String productID) throws IOException {
		ArrayList<Product> temp = getProductList();
		for(Product i: temp) {
			Product prod = i;
			if (prod.productID.equals(productID)) {
				String pID = prod.productID;
				String pName = prod.productName;
				float price = prod.price;
				int quantity = prod.quantity;
				return new Product(pID,pName,price,quantity);
			}
		}
		return null;	
	}
}
